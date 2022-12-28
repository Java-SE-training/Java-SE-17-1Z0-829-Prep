package records.sealed.interfaces;

import records.Product;
import records.sealed.interfaces.OrderLine;

import java.math.BigDecimal;

/**
 * @PROJECT Sealed_Classes_and_Interfaces
 * @Author Elimane on 28/12/2022
 */
public record SaleOrderLine(Product product, int quantity, BigDecimal amount) implements OrderLine {
}
