package com.springmodulith.demo.order.dto;

import org.jmolecules.event.types.DomainEvent;

import com.springmodulith.demo.eventAction.action.Action;
import com.springmodulith.demo.eventAction.action.CustomEventMarker;


@CustomEventMarker(eventAction = Action.EMAIL)
public record EmailDto(
    String email,
    String customerName,
    String orderIdentifier,
    long totalAmount,
    boolean orderComplete
) implements DomainEvent { 

}
