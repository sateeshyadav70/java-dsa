package Loops;

public class NestedLoop {
  public static void main(String[] args) {
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 6; j++) {
        System.out.print("*");

      }
      System.out.println(); // Move to the next line after each row

    }
  }
}
