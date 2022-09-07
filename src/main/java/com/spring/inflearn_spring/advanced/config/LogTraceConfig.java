package com.spring.inflearn_spring.advanced.config;

import com.spring.inflearn_spring.advanced.trace.logTrace.LogTrace;
import com.spring.inflearn_spring.advanced.trace.logTrace.TreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new TreadLocalLogTrace();
    }
}
