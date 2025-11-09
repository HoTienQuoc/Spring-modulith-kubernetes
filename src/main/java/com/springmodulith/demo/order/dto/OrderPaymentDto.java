package com.springmodulith.demo.order.dto;

import org.jmolecules.event.types.DomainEvent;

import com.springmodulith.demo.eventAction.action.Action;
import com.springmodulith.demo.eventAction.action.CustomEventMarker;

@CustomEventMarker(eventAction = Action.PAYMENT)
public record OrderPaymentDto(String orderId, long amount) implements DomainEvent {
    
}
