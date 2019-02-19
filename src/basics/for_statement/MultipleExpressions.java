package basics.for_statement;

public class MultipleExpressions {

    public static void main(String[] args) {
        for (int i = 2, j = 4; i <= 20; i = i + 2, j++) {
            System.out.println(i + "" + j);
        }
    }
}
