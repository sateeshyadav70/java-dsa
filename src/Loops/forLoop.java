package Loops;

import java.util.Scanner;

/*public class forLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0;
    System.out.println("enter your table number");
    int n = sc.nextInt();

    for (int num = 1; num <= n; num++) {
      sum = sum + num;
    }
    System.out.println(sum);
  }

}*/

/*public class forLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter your table number");
    int n = sc.nextInt();

    for (int num =1; num<=n; num++) {
      System.out.println(num);

    }

  }

}*/

public class forLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter your table number");
    int n = sc.nextInt();

    for (int num = n; num >= 1; num--) {
      System.out.println(num);

    }

  }

}
