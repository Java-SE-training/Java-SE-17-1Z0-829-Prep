/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package record.domainobject.additional;


import record.util.Validation;

import java.time.LocalDateTime;
import java.util.List;

// -- CANNOT MAKE CONSTRUCTOR PRIVATE IF RECORD IS ITSELF PUBLIC -- //
public record Order(long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {

  // compact constructor
  public Order {


    // Validate arguments to make sure that instance of record will be in a valid state
    Validation.checkThat(customer != null, "Customer must not be null");
    Validation.checkThat(dateTime != null, "Datetime must not be null");
    Validation.checkThat(lines != null && !lines.isEmpty(), "Lines must not be null and not empty");

    // Defensive copy of possibly immutable arguments
    lines = List.copyOf(lines); //Defensive unmodifiable copy

  }

  // Static factory methods to create instances of records
  public static Order createOrderAtCurrentDateTime(long id, Customer customer, List<OrderLine> lines){
    return new Order(id, customer, LocalDateTime.now(), lines);
  }

}
