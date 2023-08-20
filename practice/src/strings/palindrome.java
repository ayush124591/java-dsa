package strings;

public class palindrome {
    public static void main(String[] args) {
        String name = null;
        System.out.println(isPalindrome(name));
    }
    
    public static boolean isPalindrome(String s){
        if (s==null) return false ;
        int start =0 ;
        int end = s.length()-1;
        while (start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            ++start;
            --end;
        }
        return true;
    } 
}
