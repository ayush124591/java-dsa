package recursion;


public class message {
    static int x = 5 ;
    public static void main(String[] args) {
       message(100);
       System.out.println(x);
    }

    public static void message(int n){

      System.out.println(n);
    
      message(n);
  
    }
}
    
