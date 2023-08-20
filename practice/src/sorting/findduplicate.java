package sorting;

import java.util.Arrays;

public class findduplicate {
    public static void main(String[] args) {
        
    
    int[] nums={3,1,3,4,2};
    boolean helper = true;
    for(int x=0;x<nums.length;++x){
        helper = true ; 
        while(nums[x]!=x+1 && helper){
            if (checkatindex(nums,x)){
                helper = false; 
                break ; 
            }
            int temp =nums[nums[x]-1];
               nums[nums[x]-1]=nums[x];
               nums[x]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}

public static boolean checkatindex(int[] nums, int x ){
    if (nums[nums[x]-1]==nums[x]) return true ;
    return false;
} 
}