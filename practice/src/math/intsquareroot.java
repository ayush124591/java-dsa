package math;

public class intsquareroot {
    public static void main(String[] args) {
        int n =10000;
        //using binary search 
        System.out.println(root(n));
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
