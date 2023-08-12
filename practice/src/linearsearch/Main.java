package linearsearch;

public class Main {
    public static void main(String[] args) {
        System.out.println(-1/10);
    }
}
class Solution {
    public int findNumbers(int[] nums) {
        //assume none
        int occurance = 0 ;
        for(int x=0 ;x<nums.length;++x){
            if(isEven(nums[x])){
                ++occurance;
            }
        }
        return occurance;
    }

    public boolean isEven(int number){
        int x =0 ;
        while(number!=0){
            number /= 10;
            ++x;
        }
        if(x%2==0) return true;
        return false;
    }
}