package classes.inner;

/**
 * @PROJECT Advanced_Classes_and_Interfaces
 * @Author Elimane on 28/12/2022
 */
public class Enclosing {

  private String name = "Elsior1";

  public void createInner(){
    var inner = this.new Inner();
  }

  public class Inner{
    // That variable is shadowing "name" variable above in Enclosing class
    private String name = "Elsior2";

    public void run(){
      System.out.println(name);
      System.out.println(Enclosing.this.name); // Instance variable from enclosing class
    }

  }

}
