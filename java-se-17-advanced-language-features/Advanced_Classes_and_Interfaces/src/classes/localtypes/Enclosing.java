package classes.localtypes;

/**
 * @PROJECT Advanced_Classes_and_Interfaces
 * @Author Elimane on 28/12/2022
 */
// Enclosing class
public class Enclosing {

  private String name = "Elsior1";

  // Its the enclosing method
  public void enclosingMethod(int a, int b){
    int number = 23;
     // It is a local class
    class Local{
      void method(){
        System.out.println(a+b);
        System.out.println(number);
        System.out.println(name);
      }
    }
    // Instanciate it in the enclosing method
    var local = new Local();
    local.method();

    // That reinitialization is shadowing above declaration=> private String name = "Elsior1";
    name = "elsior2";

  }

}
