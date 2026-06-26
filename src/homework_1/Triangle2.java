package homework_1;

import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        String symbol = "*";

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
