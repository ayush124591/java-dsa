package recursion_practice;
public class prodofdigits {
    public static void main(String[] args) {
        int n = 11111189;
        System.out.println("sum of digits is "+prodsum(n));
    }

    public static int prodsum(int n){
            if (n==0) return 1 ;
            return (n%10)*prodsum(n/10);
    }
    
}
