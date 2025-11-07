package com.springmodulith.demo.payment;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long> {
    Optional<Payment> getPaymentsByOrderId(String orderId);
}
