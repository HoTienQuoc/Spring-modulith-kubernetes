package com.springmodulith.demo.order.dto;

import org.jmolecules.event.types.DomainEvent;

public record CompleteOrder(
    String orderIdentifier,
    boolean paymentComplete
) implements DomainEvent {

}
