package DataStructures.patterns;

public class ZeroOneTriangle {
    /**
         1 (2)
         0(3) 1(4)
         1 0 1
         0 1 0 1
         1 0 1 0 1
         0 1 0 1 0 1
     * */

    public static void main(String[] args) {
        triangle(6);
    }

    public static void triangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2 == 0)
                    System.out.print(" 1 ");
                else
                    System.out.print(" 0 ");
            }
            System.out.println();
        }
    }
}
