package com.vivekt.model;

import lombok.Builder;
import lombok.ToString;
import lombok.Value;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Value
@Builder
@ToString
public class Order {

    UUID orderId;
    String symbol;
    OrderSide side;
    BigDecimal quantity;
    BigDecimal price;

    OrderStatus status;
    Instant createdAt;
}
