package recursion_practice;
public class oneton {
    public static void main(String[] args) {
        printthis(10);
    }

    public static void printthis(int n){
        if(n==0) return ;
        printthis(n-1);
        System.out.println(n);
    }
}
