package DataStructures.recursion;

public class FactorialOfN {
    public static void main(String[] args) {
        System.out.println(calculate(10));
    }
    static int calculate(int n){
        if(n<=1){
            return 1;
        }

        return n * calculate(n-1);

    }
}
