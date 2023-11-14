package subset_subseq_string;

public class skip_the_apple {

    public static void main(String[] args) {
        String s = "thisappleisredappleyes";
        System.out.println(skip(s));
    }

    public static String skip(String s){
        if(s.length()==1) return s ;
        if(s.startsWith("apple") )
        {   if(s.length()>5)    return skip(s.substring(5,s.length()));
            else return "";
        }
        else return s.substring(0, 1) + skip(s.substring(1, s.length()));
    }
    
}
