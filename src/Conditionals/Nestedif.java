package Conditionals;

public class Nestedif {
  public static void main(String[] args) {
    int age = 20;
    boolean voterID = false;

    if (age >= 18 && voterID) {
      System.out.println("for vote");
    } else {
      System.out.println("not allowed");
    }

  }

}
