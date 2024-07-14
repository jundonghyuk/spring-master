package com.example.spring.configuraionproperty;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;

//@Getter
//@Setter
@ConfigurationProperties("my")
public class ConfigProperty {

    private final String name;
    private final Integer age;
    private final School school;

    public ConfigProperty(String na, Integer age, School school) {
        this.name = na;
        this.age = age;
        this.school = school;
    }

    @PostConstruct
    public void init() {
        System.out.println("school name: " + age);
        System.out.println("school name: " + name);
        System.out.println("school course: " + school.course);

    }

    static class School {
        private String name;
        private String course;

        public School(String name, String course) {
            this.name = name;
            this.course = course;
        }
    }
}
