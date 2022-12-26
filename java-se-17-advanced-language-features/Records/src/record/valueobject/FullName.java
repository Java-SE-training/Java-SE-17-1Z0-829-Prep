package record.valueobject;

import record.util.Validation;

/**
 * @PROJECT Records
 * @Author Elimane on 26/12/2022
 */
public record FullName(String firstName, String lastName) {
  public FullName {
    Validation.checkThat(firstName != null && !firstName.isBlank(), "firsName must not be null or blank");
    Validation.checkThat(lastName != null && !lastName.isBlank(), "lastName must not be null or blank");
  }

  @Override
  public String toString() {
    return "FullName{" +
      "firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      '}';
  }
}
