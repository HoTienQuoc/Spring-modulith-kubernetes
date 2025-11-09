package com.springmodulith.demo.order;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;



import com.springmodulith.demo.order.dto.CompleteOrder;
import com.springmodulith.demo.order.dto.CompleteOrderResponse;
import com.springmodulith.demo.order.dto.OrderDto;
import com.springmodulith.demo.order.dto.OrderResponseDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "order")
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderResponseDto> createOrder(@RequestBody @Valid OrderDto orderDto) {
        return new ResponseEntity<>(orderService.createOrder(orderDto), HttpStatus.OK);
    }

    @PostMapping(path = "complete")
    public ResponseEntity<CompleteOrderResponse> completeOrder(@RequestBody @Valid CompleteOrder completeOrder) {
        return new ResponseEntity<>(orderService.completePayment(completeOrder), HttpStatus.OK);
    }

}
