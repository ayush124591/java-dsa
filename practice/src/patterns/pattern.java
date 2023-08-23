package patterns;

public class pattern {
    public static void main(String[] args) {
        pattern6(6);

    }

    public static void pattern1(int n){
        for(int i =0 ;i<n;++i){
            for(int j=0;j<=i;++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

      public static void pattern2(int n){
        for(int i =0 ;i<n;++i){
            for(int j=i;j<n;++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

     public static void pattern3(int n){
        for(int i =n ;i>0;--i){
            for(int j=1;j<=n+1-i;++j){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

      public static void pattern4(int n){
        for(int i =0 ;i<2*n-1;++i){
            int col = i+1<n?i+1:(2*n-1)-i;
            for(int j=1;j<=col;++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

      public static void pattern5(int n){
        for(int i =0 ;i<2*n-1;++i){
            int col = i+1<n?i+1:(2*n-1)-i;
            int numspaces  = i<n ? n-1-i : i-n+1 ;
            for(int x=0;x<numspaces;++x){
            System.out.print(" ");}
            for(int j=1;j<=col;++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //here find the minimum distance 
    //from left right top bottom 
    // and use that to print the number 
      public static void pattern6(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int number = n - 2*(Math.min(Math.min(i,j),Math.min((n-i-1),(n-j-1))));
                System.out.print(number + " ");
                
            }            
            System.out.println();
        }
      
    }

      
}
