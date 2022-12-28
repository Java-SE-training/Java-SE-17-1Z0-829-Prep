import classes.inner.Enclosing;

/**
 * @PROJECT Advanced_Classes_and_Interfaces
 * @Author Elimane on 28/12/2022
 */
public class InnerClassTest {
  public static void main(String[] args) {

    var enclosing = new Enclosing();
    var inner =  enclosing.new Inner();
    inner.run();

  }
}
