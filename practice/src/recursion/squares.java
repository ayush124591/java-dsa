package recursion;

public class squares {

    public static void main(String[] args) {
        System.out.println(numSquares(43));
    }
    public static int numSquares(int n) {
        int root = (int)(Math.sqrt(n));
        int x =  rooter(root,n);
        int y = 99999999;
        if (root > 1){
        y = rooter(--root,n);
        }
        return Math.min(x,y);
    }

    public static int rooter(int root , int number){
        if (root == 0 ) return 0 ; 
        if (number == 0) return 0 ;
        if ((root*root)<=number){
            return (1 + rooter(root,number-(root*root)));
        }else {
            return (rooter (--root,number));
        }
    }
    
}
