package sorting;
import java.util.Arrays;
import java.util.ArrayList;
public class alltheduplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,2,7,8,2,3,1};
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
               System.out.println(Arrays.toString(nums));
        }
            }
     ArrayList<Integer> values = new ArrayList<Integer>();
     for(int x=0;x<nums.length;++x){
        if(nums[x]!=x+1) values.add(x);
     }
     System.out.println(values);
    }
    public static boolean checkatindex(int[] nums, int x ){
    if (nums[nums[x]-1]==nums[x]) return true ;
    return false;
} 
    }
    
