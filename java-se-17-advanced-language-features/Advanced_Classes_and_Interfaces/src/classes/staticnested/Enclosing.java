package classes.staticnested;

import java.time.LocalDate;

/**
 * @PROJECT Advanced_Classes_and_Interfaces
 * @Author Elimane on 28/12/2022
 */
public class Enclosing {

  // Static variable
  private static int number = 23;
  private static LocalDate date = LocalDate.of(2022,12,28);

  // Instance variable
  private String name = "John Doe";

  private static void printNumber(){
    // Instance variable cannot be used in static method
   // System.out.println(name);

    System.out.println(number);
  }

  private static void printDate(){
    System.out.println(date);
  }

  // Instance method
  private  void printName(){
    System.out.println(name);

    // Static variable is accessible in instance method
    System.out.println(number);
  }

   static class Nested{

     // That variables are shadowing "number,date, amd name" variables above in Enclosing class
     private static int number = 23;
     private static LocalDate date = LocalDate.of(2022,12,28);
     private String name = "John Doe";

     private  void printName(){
       System.out.println(name);
     }

     // That method is shadowing "printNumber()" method above in Enclosing class
     private static void printNumber(){
       System.out.println(number);
     }
     // That method is shadowing "printDate()" method above in Enclosing class
     private static void printDate(){
       System.out.println(date);
     }


    void run(){
      // Static members of enclosing class are accessible in static class method
      System.out.println(number);

      // Nested class members
      printNumber();
      printName();
      printDate();

      // Enclosing class members
      Enclosing.printNumber();
      Enclosing.printDate();


      // Instance members of enclosing class are not accessible in static class method
      //System.out.println(name);
      //printName();

    }

   }

}
