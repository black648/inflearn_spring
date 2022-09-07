package com.spring.inflearn_spring.advanced.trace.templatePattern.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractTemplate {
    public void excude() {
        long startTime = System.currentTimeMillis();

        //비즈니스 로직 수행
        call();
        //비즈니스 로직 종료

        long endTime = System.currentTimeMillis();
        log.info("resultTime={}", endTime - startTime);
    }

    protected abstract void call();
}
