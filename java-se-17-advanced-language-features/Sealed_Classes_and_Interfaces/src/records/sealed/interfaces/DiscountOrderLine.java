package records.sealed.interfaces;

import records.sealed.interfaces.OrderLine;

import java.math.BigDecimal;

/**
 * @PROJECT Sealed_Classes_and_Interfaces
 * @Author Elimane on 28/12/2022
 */
public record DiscountOrderLine(String discountCode,  BigDecimal amount) implements OrderLine {
}
