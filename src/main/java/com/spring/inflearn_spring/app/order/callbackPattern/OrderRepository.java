package com.spring.inflearn_spring.app.order.callbackPattern;

import com.spring.inflearn_spring.advanced.trace.callbackPattern.TraceTemplate;
import com.spring.inflearn_spring.advanced.trace.logTrace.LogTrace;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    private final TraceTemplate template;

    public OrderRepository(LogTrace trace) {
        this.template = new TraceTemplate(trace);
    }

    public void save(String id) {

        template.execute("OrderRepository.save() gggg", () -> {
            System.out.println("ggg" + id);
            return null;
        });
    }
}
