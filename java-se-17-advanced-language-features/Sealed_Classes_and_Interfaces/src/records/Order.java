package records;

import records.sealed.interfaces.OrderLine;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @PROJECT Sealed_Classes_and_Interfaces
 * @Author Elimane on 28/12/2022
 */
public record Order(long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {
}

