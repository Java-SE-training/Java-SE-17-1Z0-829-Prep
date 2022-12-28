import classes.OrderService;
import records.Customer;
import records.Order;
import records.Product;
import records.sealed.interfaces.DiscountOrderLine;
import records.sealed.interfaces.OrderLine;
import records.sealed.interfaces.SaleOrderLine;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @PROJECT Sealed_Classes_and_Interfaces
 * @Author Elimane on 28/12/2022
 */
public class SealedTest {
  public static void main(String[] args) {
    var product1 = new Product(100101L, "Apples", "Cool and fresh");
    var product2 = new Product(100101L, "Apples", "Cool and fresh");
    var customer = new Customer(200305L, "elsior","elsior@gmail.com");

    var orderLines = new ArrayList<OrderLine>();
    orderLines.add(new SaleOrderLine(product1, 2,new BigDecimal("4.45")));
    orderLines.add(new DiscountOrderLine("WELCOME",new BigDecimal("2")));
    orderLines.add(new SaleOrderLine(product2, 3,new BigDecimal("6.45")));

    // Order Added "orderLine" list is a copy of above orderLines list
    var order = new Order(600709L, customer, LocalDateTime.now(),orderLines);

    var service = new OrderService();
    var total = service.calculateTotalAmount(order);
    System.out.println(total);
  }
}
