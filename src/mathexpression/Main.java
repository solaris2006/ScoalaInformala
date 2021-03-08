package mathexpression;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringEval.evaluate("10 + (23 * 6) - 2 + 3 * (2 + 1)"));
        System.out.println(StringEval.evaluate("3+6/ 3    -1"));
    }
}
