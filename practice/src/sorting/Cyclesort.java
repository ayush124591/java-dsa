package sorting;
//we use cycle sort whennums is in range 0 to n
//containing all the numbers in between 

import java.util.Arrays;
public class Cyclesort {
    public static void main(String[] args) {
        int[]nums = {1,3,2,4};
        for(int x=0;x<nums.length;++x){
            while (!(nums[x]==x+1)){
                int temp =nums[nums[x]-1];
               nums[nums[x]-1]=nums[x];
               nums[x]=temp;
                  System.out.println(Arrays.toString(nums));

             }
            }
            System.out.println(Arrays.toString(nums));
    }
}
