package immutableclass;

import java.util.Objects;

/**
 * @PROJECT Records
 * @Author Elimane on 26/12/2022
 */
// Its an immutable class
public final class Product {
  private final long id;
  private final String name;
  private final String description;

  public Product(long id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return id == product.id && Objects.equals(name, product.name) && Objects.equals(description, product.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description);
  }

  @Override
  public String toString() {
    return "Product{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", description='" + description + '\'' +
      '}';
  }
}
