package question;

import java.util.Scanner;

public class question2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter number and type to -1 add  final output");
    int num = sc.nextInt();
    int sum = 0;

    while (num != -1) {
      sum = sum + num;
      System.out.println("enter next number");
      num = sc.nextInt();
    }
    System.out.println(sum);
  }

}
