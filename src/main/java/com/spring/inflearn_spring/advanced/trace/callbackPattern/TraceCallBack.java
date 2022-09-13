package com.spring.inflearn_spring.advanced.trace.callbackPattern;

public interface TraceCallBack<T> {
    T call();
}
