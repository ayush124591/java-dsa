package subset_subseq_string;


//same but without the ans argument 


public class skip_a_char_singleargument {

    public static void main(String[] args) {
        String s = "abacdea";
        System.out.println(skipthea(s));
    
       
    }

    public static String skipthea(String s){

        if(s.length() == 1) {
            if (s.charAt(0) == 'a') return "";
            else return s;
        } ;
        if(s.charAt(0)=='a'){
            return skipthea(s.substring(1,s.length()));
        }else {
            return s.charAt(0) + skipthea(s.subSequence(1, s.length()).toString());
        }

        
    }
    
}
