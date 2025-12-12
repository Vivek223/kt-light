package com.vivekt.services.eps.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
public class EPSExecution {

    private String executionId;
    private String orderId;       // reference back to the order
    private long executedQuantity;
    private long executedPrice;
    private Instant timestamp;
}
