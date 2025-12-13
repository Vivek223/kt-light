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
public class Execution {

    UUID executionId;
    UUID orderId;

    BigDecimal executedQuantity;
    BigDecimal executionPrice;

    Instant executedAt;
}
