package takingInput;

import java.util.Scanner;

public class ReadChrecter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter your cherecter");
    char ch = sc.next().charAt(2);

    System.out.println("your char is" + ch);

  }

}
