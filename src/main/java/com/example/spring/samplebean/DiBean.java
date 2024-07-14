package com.example.spring.samplebean;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DiBean {

    private SampleBean1 sampleBean1;

    public DiBean() {
        log.warn("run di bean no args constructor");
    }

    @PostConstruct
    void init() {
        sampleBean1.print();
    }

    @Autowired
    public void makeSampleBean12(SampleBean1 sampleBean1) {
        log.warn("run di bean setter");
        this.sampleBean1 = sampleBean1;
    }
}
