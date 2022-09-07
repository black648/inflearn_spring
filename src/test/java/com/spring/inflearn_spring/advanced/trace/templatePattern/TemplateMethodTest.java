package com.spring.inflearn_spring.advanced.trace.templatePattern;

import com.spring.inflearn_spring.advanced.trace.templatePattern.code.AbstractTemplate;
import com.spring.inflearn_spring.advanced.trace.templatePattern.code.SubClassLogic1;
import com.spring.inflearn_spring.advanced.trace.templatePattern.code.SubClassLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateMethodTest {

    @Test
    void templateMethodV1() {
        AbstractTemplate template1 = new SubClassLogic1();
        template1.excude();

        AbstractTemplate template2 = new SubClassLogic2();
        template2.excude();
    }

    @Test
    void templateMethodV2() {
//        AbstractTemplate template1 = new AbstractTemplate() {
//            @Override
//            protected void call() {
//                log.info("비즈니스 로직1 실행");
//            }
//        };
//        log.info("Class Name={}", template1.getClass());
//        template1.excude();

        new AbstractTemplate() {
            @Override
            protected void call() {
                log.info("비즈니스 로직1 실행");
            }
        }.excude();



        AbstractTemplate template2 = new AbstractTemplate() {
            @Override
            protected void call() {
                log.info("비즈니스 로직2 실행");
            }
        };
        log.info("Class Name={}", template2.getClass());
        template2.excude();
    }
}
