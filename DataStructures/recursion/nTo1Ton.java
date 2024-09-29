package DataStructures.recursion;

public class nTo1Ton {
    /**
     * Print numbers N to 1
     * then 1 to N*/
    public static void main(String[] args) {
        printN(5);
    }
    static void printN(int value){
        if (value==0){
            return;
        }
        System.out.println(value);
        printN(value-1); /** if you put printN(value--) this will throw Stack overflow Error
                                  because recursion will be called for same number*/
        System.out.println(value);

    }
}
