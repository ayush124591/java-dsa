package bitwise;

public class findbitati {
    public static void main(String[] args) {
        int n = 34;
        int bit = 7;
        //counting starts from lsb with 1
        int one = 1;
        one = one<<(bit-1);
        int ans = one & n ; 
        if(ans>0) System.out.println("one");
        else System.out.println("zero");
        int com = ~n;
        System.out.println(com);
    }
    
}
