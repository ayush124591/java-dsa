package math;
import java.util.ArrayList;
public class factors {
    public static void main(String[] args) {
        int n = 100 ;
        factorprinter2(n);

    }

    //non sorted repeated print 
    public static void factorprinter(int n ){
        int looper = 2 ;
        while(looper<=Math.sqrt(n)){
            if (n%looper==0) System.out.print(looper + " "+ n/looper+" ");
            ++looper ; 
        }
    }

    //sorted non-repeated print 
    public static void factorprinter2(int n ){
        int looper = 2 ;
        ArrayList seconds = new ArrayList<>();
        while(looper<=Math.sqrt(n)){
            if (n%looper==0) {
                System.out.print(looper + " ");
                if(!(looper == n/looper)) seconds.add(0,n/looper); 
            }
                ++looper ; 
        }
        System.out.print(seconds.toString());
    }
    
}
