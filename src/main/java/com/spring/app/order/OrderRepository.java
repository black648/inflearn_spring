package com.spring.app.order;

import com.spring.advanced.trace.TraceStatus;
import com.spring.advanced.trace.logTrace.LogTrace;
import com.spring.advanced.trace.templatePattern.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final LogTrace trace;

    TraceStatus status = null;
    public void save(String id) {

        AbstractTemplate<Void> template = new AbstractTemplate<Void>(trace) {
            @Override
            protected Void call() {
                System.out.println("OrderRepository.save() gggg" + id);
                return null;
            }
        };
        template.excute("OrderRepository.save111");

//        try {
//            status = trace.begin("OrderRepository.save");
//            System.out.println("OrderRepository.save() gggg" + id);
//        } catch (Exception e ) {
//            trace.exception(status, e);
//        }
    }
}
