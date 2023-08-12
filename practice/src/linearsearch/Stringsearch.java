package linearsearch;

public class Stringsearch {
    public static void main(String[] args) {
        String name = "kunal";
        char target = 'q';
        System.out.println(search(name,target));
    }

    static boolean search(String str,char c){
        if(str == null || c==' '){
            return false;
        }
        for(int x=0;x<str.length() ;++x){
            if(c == str.charAt(x)){
                return true;
            }
        }
        return false;
    }
}
