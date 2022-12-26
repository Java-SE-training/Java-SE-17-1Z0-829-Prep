import records.ProductRec;

/**
 * @PROJECT Records
 * @Author Elimane on 26/12/2022
 */
public class RecordTest1CreateRecord {
  public static void main(String[] args) {
    var productRec = new ProductRec(1,"Oranges", "Good and Fresh");
    var productId = productRec.id();
    var productName = productRec.name();
    System.out.printf("Product %d has name: %s%n", productId, productName);
  }
}
