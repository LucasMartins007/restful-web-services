package com.martins.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    public static final List<User> users = new ArrayList<>();

    public static int  usersCount = 3;

    static {
        users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Eve", LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount, "Jim", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(int id) {
        final Predicate<User> userPredicate = user -> user.getId().equals(id);

        return users.stream()
                .filter(userPredicate)
                .findFirst()
                .orElse(null);

    }

    public void deleteById(int id) {
        final Predicate<User> userPredicate = user -> user.getId().equals(id);

        users.removeIf(userPredicate);
    }

    public User save(User user) {
        user.setId(++usersCount);

        users.add(user);
        return user;
    }

}
