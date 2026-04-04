/* question print this pattern
******
******
******


*/
package question;

/*public class pattern {
  public static void main(String[] args) {
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 6; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

}
  */
import java.util.Scanner;

public class pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of row");
    int row = sc.nextInt();
    System.out.println("enter the number of column");
    int col = sc.nextInt();

    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= col; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
