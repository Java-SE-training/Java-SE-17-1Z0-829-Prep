import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @PROJECT Advanced_Classes_and_Interfaces
 * @Author Elimane on 28/12/2022
 */
public class AnonymousClassTest {
  public static void main(String[] args) {

    var names = new ArrayList<>(List.of("Joe", "Susan", "John", "Louise", "Alan"));

    names.sort(new Comparator<String>() {
      @Override
      public int compare(String first, String second) {
        return first.compareTo(second);
      }
    });
    System.out.println(names);

    //Here we replaced anonymous class by method reference
    // that line makes an ascendant sort based on length of names
    //names.sort(Comparator.comparingInt(String::length));
    //System.out.println(names);


  }
}
