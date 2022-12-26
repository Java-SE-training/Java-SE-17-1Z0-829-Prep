package records.valueobject;

import records.util.Validation;

/**
 * @PROJECT Records
 * @Author Elimane on 26/12/2022
 */
public record NickName(String value) {
  public NickName {
    Validation.checkThat(value != null && !value.isBlank(), "value must not be null or blank");
  }

  @Override
  public String toString() {
    return "NickName{" +
      "value='" + value + '\'' +
      '}';
  }
}
