package recursion_practice;
public class nto1 {
    public static void main(String[] args) {
        printthis(10);
    }

    public static void printthis(int n){
        System.out.println(n);
        if(n>1) printthis(n-1);
    }
}
