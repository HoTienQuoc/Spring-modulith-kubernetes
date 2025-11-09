package com.springmodulith.demo.order;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.springmodulith.demo.order.dto.CompleteOrder;
import com.springmodulith.demo.order.dto.EmailDto;
import com.springmodulith.demo.order.dto.OrderPaymentDto;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderEventService {
    private final ApplicationEventPublisher eventPublisher;

    @Transactional
    public void completeOrder(final OrderPaymentDto orderPaymentDto, EmailDto emailDto) {

        log.info("Completing order payment with details{}", orderPaymentDto);
        eventPublisher.publishEvent(orderPaymentDto);

        log.info("Sending email for order {}", emailDto);
        eventPublisher.publishEvent(emailDto);
    }

    @Transactional
    public void completePayment(CompleteOrder completeOrder, EmailDto emailDto) {
        log.info("Attempting to complete payment {}", completeOrder);
        eventPublisher.publishEvent(completeOrder);

        log.info("Completed payment Email {}", emailDto);
        eventPublisher.publishEvent(emailDto);
    }

}
