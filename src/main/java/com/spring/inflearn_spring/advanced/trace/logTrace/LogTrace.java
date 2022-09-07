package com.spring.inflearn_spring.advanced.trace.logTrace;

import com.spring.inflearn_spring.advanced.trace.TraceStatus;

public interface LogTrace {
    TraceStatus begin(String message);
    void end(TraceStatus status);
    void exception(TraceStatus status, Exception e);
}
