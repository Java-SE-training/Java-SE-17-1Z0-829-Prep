package records.sealed.interfaces;

/**
 * @PROJECT Sealed_Classes_and_Interfaces
 * @Author Elimane on 28/12/2022
 */

/***
 *  To specify Alternative type of Orderline
 */
public sealed interface OrderLine permits SaleOrderLine, DiscountOrderLine {
}
