/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package records.domainobject.additional;


import records.util.Validation;

public record Product(long id, String name, String description) {
  // Canonical is ultimately always called first
  public Product {
    Validation.checkThat(name != null && !name.isBlank(), "Name must not be null or blank");
  }

  // Additional constructor
  public Product(long id, String name) {
    this(id, name, null);
  }

}
