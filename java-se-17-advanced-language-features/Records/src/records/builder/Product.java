/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package records.builder;


import records.util.Validation;

public record Product(long id, String name, String description) {
  public Product {
    Validation.checkThat(name != null && !name.isBlank(), "Name must not be null or blank");
  }



}
