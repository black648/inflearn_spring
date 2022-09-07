package com.spring.inflearn_spring.advanced.trace.logTrace;

import com.spring.inflearn_spring.advanced.trace.TraceStatus;
import com.spring.inflearn_spring.advanced.trace.logTrace.TreadLocalLogTrace;
import org.junit.jupiter.api.Test;

class ThreadLocalLogTraceTest {

    TreadLocalLogTrace trace = new TreadLocalLogTrace();

    @Test
    void begin_end_level2() {
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.begin("hello2");
        trace.exception(status2, new IllegalStateException());
        trace.exception(status1, new IllegalStateException());
    }
}