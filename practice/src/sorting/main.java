package sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class main {
    public static void main(String[] args) {
        
    int[] nums = {4,3,2,7,8,2,3,1};
     for(int x=0;x<nums.length;++x){
            if(nums[x]>0){
            nums[nums[x]-1] = -nums[nums[x]-1];
        }
            if(nums[nums[x]-1]<0) continue;
            else {
                //nums[x] is -ve
                nums[-nums[x]-1] = -nums[-nums[x]-1];
            }
        }
        List<Integer> values = new ArrayList<Integer>();
        for(int x=0;x<nums.length;++x){
            if(nums[x]>0) values.add(x+1);
        }
        System.out.println(Arrays.toString(nums));
    }
    
}
