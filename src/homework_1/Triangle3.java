package homework_1;

import java.util.Scanner;

public class Triangle3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        String symbol = "*";
        String space = " ";

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
