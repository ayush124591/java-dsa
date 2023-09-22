package recursion_practice;

public class palindrome {
    public static void main(String[] args) {
        String name = "ttobbaabbott";
        System.out.println(pldrome(name,0));
    }

    public static boolean pldrome(String word,int n){
        if (n>(word.length()/2+1)) return true ;
        if(word.toCharArray()[n] != word.toCharArray()[word.length() -n-1]) return false ;
        return false || pldrome(word , n+1);

    }
}
    

