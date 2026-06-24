package homework_1;

public class Triangle2 {
    public static void main(String[] args) {
        int rows = 5;
        String symbol = "*";

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
