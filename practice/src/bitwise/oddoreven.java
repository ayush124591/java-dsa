package bitwise;

public class oddoreven {
    public static void main(String[] args) {
        System.out.println(isOdd(-11));
    }

    public static boolean isOdd(int n){
        return (n & 1)==1 ;
    }
    
}
