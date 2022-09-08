package com.spring.inflearn_spring.advanced.trace.strategyPattern.code;

import com.spring.inflearn_spring.advanced.trace.strategyPattern.code.strategy.ContextV1;
import com.spring.inflearn_spring.advanced.trace.strategyPattern.code.strategy.Strategy;
import com.spring.inflearn_spring.advanced.trace.strategyPattern.code.strategy.StrategyLogic1;
import com.spring.inflearn_spring.advanced.trace.strategyPattern.code.strategy.StrategyLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;


@Slf4j
public class ContextViTest {

    /**
     * 전략 패턴 적용
     */
    @Test
    void strategyV1() {
        new ContextV1(new StrategyLogic1()).excute();
        new ContextV1(new StrategyLogic2()).excute();
    }

    /**
     * 전략 패턴 익명 내부 클래스1
     */
    @Test
    void strategyV2() {
        Strategy strateLogic1 = new Strategy() {
            @Override
            public void call() {
                log.info("비즈니스 로직1 실행");
            }
        };
        log.info("strategyLogic1={}", strateLogic1.getClass());
        new ContextV1(strateLogic1).excute();

        Strategy strateLogic2 = new Strategy() {
            @Override
            public void call() {
                log.info("비즈니스 로직2 실행");
            }
        };
        log.info("strategyLogic2={}", strateLogic2.getClass());
        new ContextV1(strateLogic2).excute();
    }

    /**
     * 전략 패턴 익명 내부 클래스2
     */
    @Test
    void strategyV3() {
        ContextV1 contextV1 = new ContextV1(new Strategy() {
            @Override
            public void call() {
                log.info("비즈니스 로직1 실행");
            }
        });
        contextV1.excute();

        ContextV1 contextV2 = new ContextV1(new Strategy() {
            @Override
            public void call() {
                log.info("비즈니스 로직2 실행");
            }
        });
        contextV2.excute();
    }


    /**
     * 람다식
     */
    @Test
    void strategyV4() {

        ContextV1 contextV1Lamda1 = new ContextV1(() -> log.info("비즈니스 로직1 실행"));
        contextV1Lamda1.excute();

        ContextV1 contextV1Lamda2 = new ContextV1(() -> log.info("비즈니스 로직2 실행"));
        contextV1Lamda2.excute();
    }

}
