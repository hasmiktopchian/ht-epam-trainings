package homework_1;

public class Triangle {
    public static void main(String[] args) {
        int rows = 5;
        String symbol = "*";

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
