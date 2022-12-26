package records;

import java.util.Objects;

/**
 * @PROJECT Records
 * @Author Elimane on 26/12/2022
 */
public record Customer(long id, String name, String email) {

  @Override
  public String name(){
    return name != null && !name.isBlank() ? name : "anonymous";
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof Customer other && this.id == other.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
