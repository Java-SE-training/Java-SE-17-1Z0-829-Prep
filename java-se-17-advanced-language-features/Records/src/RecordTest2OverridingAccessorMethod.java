import records.Customer;

/**
 * @PROJECT Records
 * @Author Elimane on 26/12/2022
 */
public class RecordTest2OverridingAccessorMethod {
  public static void main(String[] args) {
    var customer = new Customer(1,null,null);
    System.out.println(customer.name());
    System.out.println(customer.toString());

    var customerCopy = new Customer(customer.id(), customer.name(), customer.email());
    System.out.println(customerCopy);
  }
}
