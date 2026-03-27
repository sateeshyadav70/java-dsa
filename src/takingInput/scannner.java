package takingInput;

import java.util.Scanner;

public class scannner {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter your lucky number");
    int num_1 = sc.nextInt();

    System.out.println("your lucky number is" + num_1);
    String Name = sc.nextLine();
    String FullName = sc.nextLine();
    System.out.println("enter your name:" + FullName);

  }

}
