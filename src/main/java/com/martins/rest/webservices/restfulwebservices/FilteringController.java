package com.martins.rest.webservices.restfulwebservices;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.martins.rest.webservices.restfulwebservices.filtering.SomeBean;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public MappingJacksonValue filtering() {
        final SomeBean someBean = new SomeBean("value1", "value2", "value4");

        final MappingJacksonValue mappingJacksonValue =  new MappingJacksonValue(someBean);
        final SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
        final FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SomeBeansFilter", filter);
        mappingJacksonValue.setFilters(filterProvider);

        return mappingJacksonValue;
    }

    @GetMapping("/filtering-list")
    public MappingJacksonValue filteringList() {
        List<SomeBean> list = List.of(new SomeBean("value1", "value2", "value4"), new SomeBean("value3", "value4", "value5"));

        final MappingJacksonValue mappingJacksonValue =  new MappingJacksonValue(list);
        final SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
        final FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SomeBeansFilter", filter);
        mappingJacksonValue.setFilters(filterProvider);

        return mappingJacksonValue;
    }
}
