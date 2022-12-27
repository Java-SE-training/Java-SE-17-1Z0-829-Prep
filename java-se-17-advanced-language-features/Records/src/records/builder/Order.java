/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package records.builder;


import records.util.Validation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public record Order(long id, Customer customer, LocalDateTime dateTime,List<OrderLine> lines) {

  // compact constructor
  public Order {

    // Validate arguments to make sure that instance of record will be in a valid state
    Validation.checkThat(customer != null, "Customer must not be null");
    Validation.checkThat(dateTime != null, "Datetime must not be null");
    Validation.checkThat(lines != null, "Lines must not be null and not empty");

    // Defensive copy of possibly immutable arguments
    lines = List.copyOf(lines); //Defensive unmodifiable copy
  }

  public Order(long id, Customer customer, LocalDateTime dateTime){
    this(id, customer, dateTime, Collections.emptyList());
  }

  // The builder is a mutable object that gathers values for building an immutable Order object when its {@code build()} method is called.
  // It has a fluent interface: Its methods for gathering the values to build an Order from return {@code this}, so that they can be used in a chain of
  // method calls that is easy to read and understand.
  public static Builder builder(){
    return new Builder();
  }

  public static class Builder {
    private long id;
    private Customer customer;
    private LocalDateTime dateTime;
    private List<OrderLine> lines = new ArrayList<>();



    // That wither method will prevent us to
    // recreate a copy of lines array when we
    // use below "withLine" wither method
    // in summary it is to create new immutable record
    public Builder fromOrder(Order order){
      this.id = order.id;
      this.customer = order.customer;
      this.dateTime = order.dateTime;
      this.lines = new ArrayList<>(order.lines);
      return this;
    }

    public Builder withId(long id){
      this.id = id;
      return this;
    }

    public Builder forCustomer(Customer customer){
      this.customer = customer;
      return this;
    }

    public Builder atDateTime(LocalDateTime dateTime){
      this.dateTime = dateTime;
      return this;
    }

    public Builder addLine(OrderLine line){
      this.lines.add(line);
      return this;
    }



    public Order build(){
      return new Order(id,customer,dateTime,lines);
    }


  }

}
