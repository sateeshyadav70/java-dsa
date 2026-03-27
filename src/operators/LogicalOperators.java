package operators;

public class LogicalOperators {
  public static void main(String[] args) {
    int p = 15;
    int q = 10;
    int r = 5;
    // and operator
    System.out.println((p > q) && (p < q));
    System.out.println((p > q) && (p > r));

    // || operator

    System.out.println((p > q) || (p < q));

    // !

    System.out.println(!(p > q));
  }

}
