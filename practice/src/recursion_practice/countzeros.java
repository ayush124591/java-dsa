package recursion_practice;

public class countzeros {
    public static void main(String[] args) {
        int n = -1010;
        System.out.println(zero(n,0));
        System.out.println(count(n));
    }
    
    public static int zero (int n,int counter ){
        if (n%10 == 0 ) ++counter ; 
        if (n/10 == 0) return counter ;
        return zero(n/10,counter);

    }

    //second approch 
    static int count(int n){
        return helper(n,0);
    }

    private static int helper(int n , int c){
        if(n==0) return c ;
        int rem = n%10 ; 
        if (rem ==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
