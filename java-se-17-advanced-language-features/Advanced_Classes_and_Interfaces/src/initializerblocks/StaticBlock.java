package initializerblocks;

/**
 * @PROJECT Advanced_Classes_and_Interfaces
 * @Author Elimane on 29/12/2022
 */
public class StaticBlock {
  private static int NUMBER; // Provide a value here

  static {
    NUMBER = 12;
  }
  public static void getNumber(){
    System.out.println(NUMBER);
  }
}
