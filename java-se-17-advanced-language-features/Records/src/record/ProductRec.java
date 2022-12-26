package record;

/**
 * @PROJECT Records
 * @Author Elimane on 26/12/2022
 */

// With record we do not need to add contructors, equals, hashcode methods
  // compiler automatically and implicitly generate it and translate this
  // record to a final class with private finals fields for the components (id, name, description)
  // also genenrate constructor
  // and accessor methods
public record ProductRec(long id, String name, String description) {


//  private final long id;
//  private final String name;
//  private final String description;
//
//  public Product(long id, String name, String description) {
//    this.id = id;
//    this.name = name;
//    this.description = description;
//  }
//
//  public long getId() {
//    return id;
//  }
//
//  public String getName() {
//    return name;
//  }
//
//  public String getDescription() {
//    return description;
//  }

  // Not allowed
  //  private  long id;

  // (Static fields) allowed
  private static int VALUE = 23;


  public boolean hasDescription(){
    return description != null && !description.isBlank();
  }
}
