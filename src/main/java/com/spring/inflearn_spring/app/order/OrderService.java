package com.spring.inflearn_spring.app.order;

import com.spring.inflearn_spring.advanced.trace.TraceStatus;
import com.spring.inflearn_spring.advanced.trace.logTrace.LogTrace;
import com.spring.inflearn_spring.advanced.trace.templatePattern.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final LogTrace trace;

    TraceStatus status = null;
    public void save(String id) {

        AbstractTemplate<Void> template = new AbstractTemplate<Void>(trace) {
            @Override
            protected Void call() {
                orderRepository.save(id);
                return null;
            }
        };
        template.excute("OrderService.save");

//        try {
//            status = trace.begin("OrderService.save");
//            orderRepository.save(id);
//        } catch (Exception e ) {
//            trace.exception(status, e);
//        }

    }

}
