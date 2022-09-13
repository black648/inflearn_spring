package com.spring.inflearn_spring.app.order.callbackPattern;

import com.spring.inflearn_spring.advanced.trace.callbackPattern.TraceTemplate;
import com.spring.inflearn_spring.advanced.trace.logTrace.LogTrace;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final TraceTemplate template;
    private final OrderService orderService;

    public OrderController(LogTrace trace, OrderService orderService) {
        this.template = new TraceTemplate(trace);
        this.orderService = orderService;
    }


    @GetMapping("/order/callback/save")
    public String save(String id) {
        return template.execute("OrderController.save()", () -> {
            orderService.save(id);
            return "ok";
        });
    }

}
