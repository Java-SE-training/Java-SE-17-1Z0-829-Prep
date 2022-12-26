import records.withermethods.Customer;
import records.withermethods.Order;
import records.withermethods.OrderLine;
import records.withermethods.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @PROJECT Records
 * @Author Elimane on 26/12/2022
 */
public class WitherMethodsTest {
  public static void main(String[] args) {

    var product1 = new Product(100345L,"Burger","Cheddar and meat");
    var product2 = new Product(100348L,"Sandwich","Cheddar and meat");

    var customer = new Customer(200405L, "John Doe", "jd@gmail.com");

    var line = new OrderLine(product1,4,new BigDecimal("7.80"));
    var orderLine = new OrderLine(line.product(),line.quantity(),line.price());

    var newOrderLine = line.withQuantity(3).withPrice(new BigDecimal("8.08"));

    var order = new Order(300405L, customer, LocalDateTime.now())
      .withLine( new OrderLine(product1,4,new BigDecimal("7.80")))
      .withLine( new OrderLine(product2,4,new BigDecimal("2.50")));

    System.out.println(order);



  }
}
