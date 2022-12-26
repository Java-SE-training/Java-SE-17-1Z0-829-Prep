/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package record.withermethods;

import record.builder.Order;
import record.util.Validation;

import java.math.BigDecimal;
import java.util.List;

public record OrderLine(Product product, int quantity, BigDecimal price) {

  // compact constructor
  public OrderLine {
    // Validate arguments to make sure that instance of record will be in a valid state
    Validation.checkThat(product != null, "product must not be null");
    Validation.checkThat(price != null, "price must not be null");
  }
  // --------------- Wither Methods -------------------------------
  // We use wither methods to make instantiation more cleaner
  public OrderLine withQuantity(int newQuantity){
    return new OrderLine(this.product, newQuantity, this.price);
  }

  public OrderLine withPrice(BigDecimal newPrice){
    return new OrderLine(this.product, this.quantity, newPrice);
  }
// --------------- Wither Methods -------------------------------
}
