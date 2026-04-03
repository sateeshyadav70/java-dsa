package Loops;

import java.util.Scanner;

public class whileLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter executing number");

    int n = sc.nextInt();
    int num = 1;

    while (num <= n) {
      System.out.println(num);
      num++;
    }
  }

}
