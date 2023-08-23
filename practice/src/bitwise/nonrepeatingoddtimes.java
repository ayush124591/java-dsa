package bitwise;
import java.util.Arrays;
//find the non repeating number 
//where all other numbers repeat odd times
public class nonrepeatingoddtimes {
    public static void main(String[] args) {
        int[] arr = {1,1,1,4,10,4,4,5,5,5};
        int numofrep = 3;
        int[] power = {1,2,4,8,16,32,64,128};
        int[] bitsum = new int[power.length];
        for(int number : arr){
            for(int x=0;x<power.length;++x){
                if((number&power[x])==power[x]){
                    ++bitsum[x];
                }
            }
        }
        int number = 0 ; 
        for(int x=0;x<bitsum.length;++x){
            
            bitsum[x] = (bitsum[x]%numofrep);
            number += bitsum[x]*power[x];
                }

        System.out.println(number);
    }
}
