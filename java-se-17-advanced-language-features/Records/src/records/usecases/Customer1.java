package records.usecases;

import records.util.Validation;

import java.util.regex.Pattern;

/**
 * @PROJECT Records
 * @Author Elimane on 26/12/2022
 */

/***
 * @Stringly typed record => except id, all components are of type String
 */
public record Customer1(long id, String firstName, String familyName, String nickName, String email) {

  private static final Pattern EMAIL_PATTERN = Pattern.compile(".+@.+\\..+");

  // Compact constructor
  public Customer1 {
    Validation.checkThat(firstName != null && !firstName.isBlank(), "firsName must not be null or blank");
    Validation.checkThat(familyName != null && !familyName.isBlank(), "familyName must not be null or blank");
    Validation.checkThat(nickName != null && !nickName.isBlank(), "nickName must not be null or blank");
    Validation.checkThat(email != null && !email.isBlank(), "email must not be null or blank");
    Validation.checkThat(EMAIL_PATTERN.matcher(email).matches(), "not a valid email address: "+ email);
  }
}
