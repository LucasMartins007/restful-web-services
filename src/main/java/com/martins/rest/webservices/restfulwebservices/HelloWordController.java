package com.martins.rest.webservices.restfulwebservices;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWordController {

    private final MessageSource messageSource;

    public HelloWordController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping(path = "/hello-word")
    public String helloWord() {
        return "Hello word";
    }

    @GetMapping(path = "/hello-word-bean")
    public HelloWordBean helloWordBean() {
        return new HelloWordBean("Hello-word");
    }

    @GetMapping(path = "/hello-word-internationalized")
    public String helloWordInternationalized() {
        final Locale locale = LocaleContextHolder.getLocale();
        System.out.println(locale.getCountry());
        return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
    }

}
