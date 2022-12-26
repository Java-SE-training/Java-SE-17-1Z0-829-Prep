package records.valueobject;

import records.util.Validation;

import java.util.regex.Pattern;

/**
 * @PROJECT Records
 * @Author Elimane on 26/12/2022
 */
public record EmailAddress(String value) {
  private static final Pattern EMAIL_PATTERN = Pattern.compile(".+@.+\\..+");

  public EmailAddress {
    Validation.checkThat(value != null && !value.isBlank(), "value must not be null or blank");
    Validation.checkThat(EMAIL_PATTERN.matcher(value).matches(), "not a valid email address: "+ value);
  }
}
