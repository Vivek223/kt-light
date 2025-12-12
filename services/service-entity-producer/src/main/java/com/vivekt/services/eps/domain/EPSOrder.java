package com.vivekt.services.eps.domain;

import lombok.*;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EPSOrder {

    private String orderId;
    private String symbol;        // e.g., AAPL, MSFT
    private String side;          // BUY or SELL
    private long quantity;
    private double price;     // limit price
    private String traderId;
    private Instant timestamp;

    public EPSOrder(String orderId) {
        this.orderId = orderId;
    }
}
