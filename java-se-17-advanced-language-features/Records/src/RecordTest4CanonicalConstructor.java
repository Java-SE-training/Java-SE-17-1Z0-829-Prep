import records.domainobject.canonical.Customer;
import records.domainobject.canonical.Order;
import records.domainobject.canonical.OrderLine;
import records.domainobject.canonical.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @PROJECT Records
 * @Author Elimane on 26/12/2022
 */
public class RecordTest4CanonicalConstructor {
  public static void main(String[] args) {
     var p1 = new Product(100101L, "Apples", "Cool and fresh");
     var p2 = new Product(100102L, "Oranges", "Cool and sweat");

     var customer = new Customer(200305L, "elsior","elsior@gmail.com");

     var orderLines = new ArrayList<OrderLine>();
     orderLines.add(new OrderLine(p1, 2,new BigDecimal("4.45")));
     orderLines.add(new OrderLine(p2, 3,new BigDecimal("6.45")));

     // Order Added "orderLine" list is a copy of above orderLines list
     var order = new Order(600709L, customer, LocalDateTime.now(),orderLines);

     var orderLine = new OrderLine(new Product(100103L, "Water", "Cool and fresh"),1,new BigDecimal("0.99"));
     // That orderLine is not added to the list into Order object
    // because the list is immutable
     orderLines.add(orderLine);

     // It is an .UnsupportedOperationException because "lines" is an immutable list
     order.lines().add(orderLine);

     System.out.println(order);
  }
}
