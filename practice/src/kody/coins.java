package kody;
import java.sql.SQLOutput;
import java.util.Scanner;
public class coins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter amount :- ");
        int value = input.nextInt();
        int[] denominations = {2000,500,200,100,50,20,10,5,2,1};
        int[] nums = new int[denominations.length];
        int valuecopy = value ;
        int looper = -1;
        while (valuecopy != 0 ){
            ++looper;

            if( dval(valuecopy,denominations[looper]) == -1){
                continue ;
            }else {
                nums[looper] = dval(valuecopy,denominations[looper]);
                valuecopy -= nums[looper]*denominations[looper];
            }
        }

        System.out.println("your change is as follows :- ");
        for(int x=0;x<nums.length;++x){
            if(nums[x]>0){
                System.out.println(nums[x] + " coins of "+denominations[x]);
            }
        }

    }

    //check if divisible or not and return denominations if divisible
    static int dval(int value, int denom){
        if(value<denom) return -1; //smaller
        else {
            return value/denom ;
        }
    }
}
