

import records.builder.Customer;
import records.builder.Order;
import records.builder.OrderLine;
import records.builder.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @PROJECT Records
 * @Author Elimane on 26/12/2022
 */
public class BuilderPatternTest {
  public static void main(String[] args) {

    var product1 = new Product(300567L, "Apples", "Tasty red apples");
    var product2 = new Product(300568L, "Bread", "Sweat toast");

    var customer = new Customer(300568L, "Joe", "joe@gmail.com");
    var customer2 = new Customer(300564L, "Jane", "jane@gmail.com");
    var order1 = new Order(300568L, customer, LocalDateTime.now());



    var order2 = Order
                         .builder()
                         .fromOrder(order1)
                         .withId(order1.id())
                         .forCustomer(order1.customer())
                         .atDateTime(order1.dateTime())
                         .addLine(new OrderLine(product2, 6, new BigDecimal("5.94")))
                         .addLine(new OrderLine(product1, 6, new BigDecimal("2.50")))
                         .build();
    //System.out.println(order2);


    System.out.println(order2);

  }
}
