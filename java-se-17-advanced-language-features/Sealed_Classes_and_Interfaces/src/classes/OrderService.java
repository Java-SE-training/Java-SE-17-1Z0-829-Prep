package classes;

import records.Order;
import records.sealed.interfaces.DiscountOrderLine;
import records.sealed.interfaces.OrderLine;
import records.sealed.interfaces.SaleOrderLine;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @PROJECT Sealed_Classes_and_Interfaces
 * @Author Elimane on 28/12/2022
 */
public class OrderService {
  public BigDecimal calculateTotalAmount(Order order) {
    var total = BigDecimal.ZERO;
    for (OrderLine line : order.lines()) {
      if (line instanceof SaleOrderLine sale) {
        total = total.add(sale.amount());
      } else if (line instanceof DiscountOrderLine discount) {
        total = total.subtract(discount.amount());
      }
    }
    return total;
  }
}
