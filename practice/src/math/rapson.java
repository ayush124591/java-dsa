package math;
//this is newton rapson sqrt method 
// where we are guessing the root !!

public class rapson {
    public static void main(String[] args) {
        int n = 14587 ;
        System.out.println(rapsonroot(n));
    }

    public static double rapsonroot(double n){
        double root = n;
        double error = n ; 
        double proot = root ; 
        while(true){
            proot = root ; 
            root = (root + n/root)/2;
            error = Math.abs(proot-root);
            if (error < 0.000001 ) break ; 
            
        }
        return root ;
    }
    
}
