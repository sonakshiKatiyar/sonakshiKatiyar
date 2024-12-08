package DataStructures.patterns;

public class ButterflyStar {
    /**
         *    *
         **  **
         ******
         ******
         **  **
         *    *
     * */
    public static void main(String[] args) {
        butterflyPattern(3);
    }
    public static void butterflyPattern(int n){
        for (int i=1; i<=n; i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int k=1;k<=((n-i)*2);k++){
                System.out.print(" ");
            }
            //star
            for(int j=(2*n-(i-1));j<=2*n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >0 ; i--) {
            //star
            for(int j=(2*n-(i-1));j<=2*n;j++){
                System.out.print("*");
            }
            //spaces
            for(int k=1;k<=((n-i)*2);k++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
