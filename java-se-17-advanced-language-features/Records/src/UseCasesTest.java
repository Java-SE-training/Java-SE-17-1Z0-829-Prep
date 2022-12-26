import records.usecases.*;
import records.valueobject.Customer2;
import records.valueobject.EmailAddress;
import records.valueobject.FullName;
import records.valueobject.NickName;

/**
 * @PROJECT Records
 * @Author Elimane on 26/12/2022
 */
public class UseCasesTest {
  public static void main(String[] args) {
    var customer1 = new Customer1(500709L, "John","Doe", "elsior", "jde@gmail.com");
    var customer2 = new Customer2(500710L, new FullName("Scott","Tiger"), new NickName("Soctiger"),  new EmailAddress("jde@gmail.com"));
    System.out.println(customer2);
  }
}
