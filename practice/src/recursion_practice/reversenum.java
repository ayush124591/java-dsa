package recursion_practice;

public class reversenum {
    
public static void main(String[] args) {
    reverse(123456789);
}

static void reverse(int n){
    if (n==0) return ; 
    System.out.print(n%10);
    reverse(n/10);
}
}
