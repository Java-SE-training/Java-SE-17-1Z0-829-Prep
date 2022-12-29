import initializerblocks.InstanceBlock;
import initializerblocks.StaticBlock;

/**
 * @PROJECT Advanced_Classes_and_Interfaces
 * @Author Elimane on 29/12/2022
 */
public class BlocksTest {

  public static void main(String[] args) {

    StaticBlock.getNumber();

    InstanceBlock instanceBlock = new InstanceBlock();

    instanceBlock.getNumber();

  }

}
