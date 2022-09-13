package com.spring.inflearn_spring.app.order.callbackPattern;

import com.spring.inflearn_spring.advanced.trace.callbackPattern.TraceTemplate;
import com.spring.inflearn_spring.advanced.trace.logTrace.LogTrace;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final TraceTemplate template;

    public OrderService(LogTrace logTrace, OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
        this.template = new TraceTemplate(logTrace);
    }

    public void save(String id) {
        template.execute("OrderService.save", () -> {
            orderRepository.save(id);
            return null;
        });
    }

}
