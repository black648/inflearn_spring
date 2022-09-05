package com.spring.advanced.config;

import com.spring.advanced.trace.logTrace.LogTrace;
import com.spring.advanced.trace.logTrace.TreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new TreadLocalLogTrace();
    }
}
