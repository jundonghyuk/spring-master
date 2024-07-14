package com.example.spring.collectiondi;

import jakarta.annotation.PostConstruct;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CollectionDiBean {

    private final Map<Integer, Name> beans;

    @PostConstruct
    public void init() {
        for (Integer key : beans.keySet()) {
            log.info("key: {}, value class: {}", key, beans.get(key).getClass());
        }
    }
}
