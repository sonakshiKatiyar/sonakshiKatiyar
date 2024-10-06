package DataStructures.patterns;

import java.util.Scanner;

public class InverseTriangle {
    /**
            1 2 3 4 5 6
             2 3 4 5 6
              3 4 5 6
               4 5 6
                5 6
                 6
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pattern(scanner.nextInt());
    }

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <= i-1; j++) {
                System.out.print(" ");
            }

            for (int k = i ; k <= n; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
