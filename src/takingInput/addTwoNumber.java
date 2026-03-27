package takingInput;

import java.util.Scanner;

public class addTwoNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first number");
    int a = sc.nextInt();
    System.out.println("enter second number");
    int b = sc.nextInt();

    int add = a + b;

    System.out.println("total add is:" + add);
  }

}
