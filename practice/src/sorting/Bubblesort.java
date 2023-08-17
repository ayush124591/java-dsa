//nums may be repeating 

package sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
    
        int[] nums= {1,2,3,4,5};
        System.out.println("before sorting the array ");
        System.out.println(Arrays.toString(nums));
        System.out.println("after sorting the array ");
        System.out.println(Arrays.toString(bubble(nums)));
      
        
    }

    //bubble 
    //return an array 
    //smallest left
    public static int[] bubble(int[] nums){
        int length = nums.length;
        boolean changed ; 
        int counter = 0 ;
        for(int x=0;x<length;++x){
            //-2 because the other one signifies no of comparision not 
            //number of elements 
            changed = false;
            for(int y=0;y<length-1-x;++y){
                if(nums[y+1]<nums[y]){
                    int temp = nums[y];
                    nums[y] = nums[y+1];
                    nums[y+1] = temp;
                    changed = true;
                    
                }
                    ++counter;
            }
           
            System.out.println(Arrays.toString(nums));      
        }

        System.out.println(counter);
        return nums;
    }
    
}
