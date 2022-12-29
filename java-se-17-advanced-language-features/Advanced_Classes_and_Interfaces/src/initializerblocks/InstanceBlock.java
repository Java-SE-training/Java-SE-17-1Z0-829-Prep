package initializerblocks;

/**
 * @PROJECT Advanced_Classes_and_Interfaces
 * @Author Elimane on 29/12/2022
 */
public class InstanceBlock {
  private int NUMBER;
  {
    NUMBER = 12;
  }

  public void getNumber(){
    System.out.println(NUMBER);
  }
}
