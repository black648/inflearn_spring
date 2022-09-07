package com.spring.inflearn_spring.advanced.trace.helloTrace;

import com.spring.inflearn_spring.advanced.trace.TraceStatus;
import com.spring.inflearn_spring.advanced.trace.helloTrace.HelloTraceV1;
import org.junit.jupiter.api.Test;

class helloTraceV1Test {

    @Test
    void begin() {
    }

    @Test
    void end() {
    }

    @Test
    void exception() {
    }

    @Test
    void begin_end() {
        HelloTraceV1 traceV1 = new HelloTraceV1();
        TraceStatus status = traceV1.begin("hello");
        traceV1.end(status);
    }

    @Test
    void begin_exception() {
        HelloTraceV1 traceV1 = new HelloTraceV1();
        TraceStatus status = traceV1.begin("hello");
        traceV1.exception(status, new IllegalStateException());
    }
}