package DataStructures.patterns;

public class Diamond {

    /**-----------------
     Pattern:
              *
             * *
            *   *
           *     *
          *       *
         *         *
          *       *
           *     *
            *   *
             * *
              *
     -----------*/
    public static void main(String[] args) {
        pattern(6);
    }

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i-1); j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=n-1; i>0;i--){
            for (int k = n - i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i-1); j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
