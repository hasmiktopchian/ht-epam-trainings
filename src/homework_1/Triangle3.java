package homework_1;

public class Triangle3 {
    public static void main(String[] args) {
        String symbol = "*";
        String space = " ";
        int rows = 5;

        for (int j = rows; j >= 1; j--) {
            for (int i = 1; i < j; i++) {
                System.out.print(space);
            }
            for (int k = 1; k <= (rows - j) * 2 + 1; k++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
