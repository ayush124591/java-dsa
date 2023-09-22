package recursionarr;

import java.util.Arrays;
import java.util.ArrayList;

public class Isthearrsorted {
    public static void main(String[] args) {
        
        int[] nums = {9,12,0};
        System.out.println(checkorder(nums));
    }
    
    static boolean checkorder(int[] nums){
        return helper( nums , 0 );
    }

    static boolean helper(int[] nums , int index){
            if(nums[index]>nums[index+1]) return false ;
            if(index+1== nums.length -1) return true ;  
            return helper(nums,index+1);   
    
    }
}
