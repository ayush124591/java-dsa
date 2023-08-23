package bitwise;
//solution works only if the number of times the number 
//repeating is even 
public class nonrepeatingnumber {
    public static void main(String[] args) {
        //all elements appear twice 
        //except for one 
        int[] num = {1,2,3,2,7,1,7,100,3};
        System.out.println(finder(num));
    
    }

    public static int finder(int[] num){
        int ans = 0;
        for(int x: num){
            ans  = ans^x;
        }
        return ans;
    }
}
