package recursion_practice;
public class sumofdigits {
    public static void main(String[] args) {
        int n = 123234;
        System.out.println("sum of digits is "+digitsum(n));
    }

    public static int digitsum(int n){
            if (n==0) return 0 ;
            return (n%10)+digitsum(n/10);
    }
    
}
