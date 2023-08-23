package bitwise;

public class magicnumbers {
    public static void main(String[] args) {
        System.out.println(magicnum(2));
    }

    public static int magicnum(int n){
        int result = 0 ; 
        int compare = 1;
        //find the number of digits of a number n 
        int digits = (int)(Math.log(n)/Math.log(2)) + 1 ; 
        for(int x=1;x<=digits;++x){
        
            if((compare&n)==compare) {
                result+= Math.pow(5, x);
        }
        compare = compare <<1;
    }
        return result ;  
}}
