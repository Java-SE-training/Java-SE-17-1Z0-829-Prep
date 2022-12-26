package record.util;

/**
 * @PROJECT Records
 * @Author Elimane on 26/12/2022
 */

/***
 *  Utility class for validation
 */
public class Validation {
  private Validation() {
  }
  public static void checkThat(boolean expr, String message){
    if(!expr){
      throw new IllegalArgumentException(message);
    }
  }
}
