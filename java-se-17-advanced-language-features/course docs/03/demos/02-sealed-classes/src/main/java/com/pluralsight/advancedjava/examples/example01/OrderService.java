/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.examples.example01;

import java.math.BigDecimal;

public class OrderService {

    public BigDecimal calculateTotalAmount(Order order) {
        var total = BigDecimal.ZERO;

        for (OrderLine line : order.lines()) {
            // Side note: In a future version of Java you will be able to use a pattern matching switch expression here.
            // This is available in Java 17 as a preview feature, but not yet as a standard feature.
            if (line instanceof SaleOrderLine sale) {
                total = total.add(sale.amount());
            } else if (line instanceof DiscountOrderLine discount) {
                total = total.subtract(discount.amount());
            }
        }

        return total;
    }
}
