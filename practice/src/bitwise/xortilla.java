package bitwise;

public class xortilla {
    public static void main(String[] args) {
        System.out.println(xorer(3));
    }
    
    public static int xorer(int n){
        if (n==1) return 1; 
        return n^xorer(n-1);
    }
}
