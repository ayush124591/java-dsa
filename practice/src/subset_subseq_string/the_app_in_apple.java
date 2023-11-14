package subset_subseq_string;

public class the_app_in_apple {

    public static void main(String[] args) {
        String s = "theappinappleapped";
        System.out.println(app_out_apple(s));
    }
    
    // skip the app unless it is in apple

    public static String app_out_apple(String s){

        if (s.length()==1) return s ; 
        if (s.startsWith("app") & !(s.startsWith("apple"))){
             return app_out_apple(s.substring(3,s.length()));
        }
        return s.substring(0, 1) + app_out_apple(s.substring(1,s.length()));
    }
}
