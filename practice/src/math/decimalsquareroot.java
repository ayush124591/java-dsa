package math;

public class decimalsquareroot {
    public static void main(String[] args) {
        int n = 105;
        int intpart = root(n);
        float decimalpart = decimalrooter(intpart,n);
        System.out.println(intpart+decimalpart);
    }

    public static float decimalrooter(int intpart,int n){
        float decimallimit = 0.01f;
        float inn = 0.1f;
        for (float i = decimallimit ; i < (decimallimit*100) ; i+=decimallimit) {
            if((intpart+i)*(intpart+i)<n && (intpart+i+decimallimit)*(intpart+i+decimallimit)>n){
                inn = i ;
                break ; 
            }
        }
        return inn ; 
    }
    public static int root(int n){
        int rvalue = n;
        int lvalue = 0 ;
        int mid = (lvalue+rvalue)/2;
        while(true){
            if((mid*mid)<=n && (mid+1)*(mid+1)>n){
                break ;
            }
            else if((mid*mid)<n){
                lvalue = mid ;
                mid = (lvalue+rvalue)/2;
            }else {
                rvalue = mid ;
                mid = (lvalue + rvalue)/2;
            }}
        return mid;
    }
  
    
}
