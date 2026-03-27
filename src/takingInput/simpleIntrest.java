package takingInput;

import java.util.Scanner;

public class simpleIntrest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter your principle");
    double P = sc.nextDouble();

    System.out.println("enter your rate");
    double R = sc.nextDouble();

    System.out.println("enter your time");
    double T = sc.nextDouble();

    double SI = (P * R * T) / 100;

    System.out.println("your si is:" + SI);
  }
}
