// import classes.staticnested.Enclosing.Nested;

import classes.staticnested.Enclosing;

/**
 * @PROJECT Advanced_Classes_and_Interfaces
 * @Author Elimane on 28/12/2022
 */
public class StaticNestedClassTest {
  public static void main(String[] args) {

    var nested = new Enclosing.Nested();

      // We can declare it in that way, when we use that above import => import classes.staticnested.Enclosing.Nested;
      // var nested = new Nested();

  }
}
