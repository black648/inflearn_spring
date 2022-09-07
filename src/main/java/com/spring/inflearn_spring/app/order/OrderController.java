package com.spring.inflearn_spring.app.order;

import com.spring.inflearn_spring.advanced.trace.logTrace.LogTrace;
import com.spring.inflearn_spring.advanced.trace.templatePattern.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final LogTrace trace;
    private final OrderService orderService;

    @GetMapping("/order/save")
    public String save(String id) {

        AbstractTemplate<String> template = new AbstractTemplate<>(trace) {
            @Override
            protected String call() {
                orderService.save(id);
                return "ok";
            }
        };
        return template.excute("OrderController.save()");

//        TraceStatus status = null;
//        try{
//            status = trace.begin("OrderController.save()");
//            orderService.save(id);
//            trace.end(status);
//            return "ok";
//        } catch (Exception e) {
//            trace.exception(status, e);
//            throw e; //예외를 꼭 던져주자구
//        }
    }

}
