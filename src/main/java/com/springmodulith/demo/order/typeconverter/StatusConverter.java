package com.springmodulith.demo.order.typeconverter;

import java.util.Arrays;

import com.springmodulith.demo.order.type.Status;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply=true)
public class StatusConverter implements AttributeConverter<Status, String> {

    @Override
    public String convertToDatabaseColumn(Status status) {
        return Arrays.stream(Status.values())
            .filter(s -> s == status)
            .map(Status::getCode)
            .findFirst().orElseThrow(() -> new IllegalArgumentException("No status found"));
    }

    @Override
    public Status convertToEntityAttribute(String code) {
        return Arrays.stream(Status.values())
            .filter(s -> s.getCode().equalsIgnoreCase(code))
            .findFirst().orElseThrow(() -> new IllegalArgumentException("No status found"));
    }

}
