package record.valueobject;

import record.util.Validation;

/**
 * @PROJECT Records
 * @Author Elimane on 26/12/2022
 */

/***
 * @Stringly typed record => except id, all components are of type String
 */
public record Customer2(long id, FullName fullName, NickName nickName, EmailAddress email) {

  // Compact constructor
  public Customer2 {
    Validation.checkThat(fullName != null, "fullName must not be null or blank");
    Validation.checkThat(nickName != null, "nickName must not be null or blank");
    Validation.checkThat(email != null, "email must not be null or blank");
  }
}
