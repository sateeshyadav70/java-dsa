package question;

import java.util.Scanner;

public class switchCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Question:- who is the prime minister of India?");

    System.out.println("1:- Rahul Gandhi");
    System.out.println("2:-Akhlish yadav");
    System.out.println("3-tejshvi yadav ");
    System.out.println("4:-Narendra Modi");

    System.out.println("choose your answer(1-4)");
    int choice = sc.nextInt();

    switch (choice) {
      case 1:
        System.out.println("Wrong--Rahul Gandhi is not current prime minister of india");
        break;

      case 2:
        System.out.println("Wrong--Akhlish yadav is not current prime minister of india");
        break;

      case 3:
        System.out.println("Wrong--Tejshvi yadav is not current prime minister of india");
        break;

      case 4:
        System.out.println("Right--Narendra Modi is current prime minister of india");
        break;
    }
  }

}
