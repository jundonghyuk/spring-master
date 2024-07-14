package com.example.spring.samplebean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SampleBean1 {

    public SampleBean1() {
        log.info("run sample bean no args constructor");
    }

    public void print() {
        log.info("hi this is sample bean1");
    }
}
