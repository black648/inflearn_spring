package com.spring.advanced.trace.helloTrace;

import com.spring.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        helloTraceV1 traceV1 = new helloTraceV1();
        TraceStatus status = traceV1.begin("hello");
        traceV1.end(status);
    }

    @Test
    void begin_exception() {
        helloTraceV1 traceV1 = new helloTraceV1();
        TraceStatus status = traceV1.begin("hello");
        traceV1.exception(status, new IllegalStateException());
    }
}