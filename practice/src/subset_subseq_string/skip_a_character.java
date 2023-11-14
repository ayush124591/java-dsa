package subset_subseq_string;

public class skip_a_character {
    //remove a from string 
   
    
    public static void main(String[] args) {
        String str = "abbcacaba";
        System.out.println(skipthea(str));

    }

    public static String skipthea(String s){
        if (s.length()==0) return "string is empty" ;
        String ans="";
        return skiptheahelp(ans,s,0); 
    }


    public static String skiptheahelp(String ans , String org , int index){

        //end case condition 
        if (index == org.length()) return ans ;
        if(org.charAt(index)  == 'a' ){
        }else {
            ans = ans + org.charAt(index);
        }

        return skiptheahelp(ans,org,++index);

    }

}
