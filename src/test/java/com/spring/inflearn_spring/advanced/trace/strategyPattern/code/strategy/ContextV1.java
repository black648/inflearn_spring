package com.spring.inflearn_spring.advanced.trace.strategyPattern.code.strategy;

import com.spring.inflearn_spring.advanced.trace.strategyPattern.code.strategy.Strategy;
import lombok.extern.slf4j.Slf4j;

/**
 * 필드에 전략을 보관하는 방식
 */
@Slf4j
public class ContextV1 {
    private Strategy strategy;

    public ContextV1(Strategy strategy) {
        this.strategy = strategy;
    }

    public void excute() {
        long startTime = System.currentTimeMillis();

        //비즈니스 로직 수행
        strategy.call();
        //비즈니스 로직 종료

        long endTime = System.currentTimeMillis();
        log.info("resultTime={}", endTime - startTime);
    }
}
