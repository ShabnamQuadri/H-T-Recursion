public class HT_recursion {
  public static void main(String[] args) {
    int n = 3;
    toss(n, " ");
  }

  public static void toss(int n, String s) {
    if (n == 0) {
      System.out.println(s);
      return;
    }
    if (s.length() == 0 || s.charAt(s.length() - 1) != 'H') {
      toss(n - 1, s + 'H');

    }
    toss(n - 1, s + 'T');
  }
}
