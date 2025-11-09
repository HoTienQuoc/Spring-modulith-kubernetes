package com.springmodulith.demo.order.dto;

import org.jmolecules.event.types.DomainEvent;

import jakarta.validation.constraints.NotBlank;

public record CompleteOrder(
    @NotBlank(message = "orderIdentifier is required")
    String orderIdentifier,
    boolean paymentComplete
) implements DomainEvent {

}
