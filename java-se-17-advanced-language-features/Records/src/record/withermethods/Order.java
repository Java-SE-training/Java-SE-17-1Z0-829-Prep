/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package record.withermethods;



import record.util.Validation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public record Order(long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {

  // compact constructor
  public Order {

    // Validate arguments to make sure that instance of record will be in a valid state
    Validation.checkThat(customer != null, "Customer must not be null");
    Validation.checkThat(dateTime != null, "Datetime must not be null");
    Validation.checkThat(lines != null, "Lines must not be null and not empty");

    // Defensive copy of possibly immutable arguments
    lines = List.copyOf(lines); //Defensive unmodifiable copy

  }

  // Canonical constructor
  public Order(long id, Customer customer, LocalDateTime dateTime){
    this(id, customer, dateTime, Collections.emptyList());
  }

  public Order withLine(OrderLine line){
    var newLines = new ArrayList<>(this.lines);
    newLines.add(line);
    return new Order(this.id, this.customer, this.dateTime, newLines);
  }


}
