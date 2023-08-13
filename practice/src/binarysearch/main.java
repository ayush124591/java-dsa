package binarysearch;
public class main{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,5,5,5,6};
        int target = 5;
        int[] ans = {-1,-1};

        ans[0] = search(nums,target,true);
        if(ans[0] != -1){
        ans[1] = search(nums,target,false);
        }
        return ans;

    }

    public static int search(int[] nums,int target,boolean findingStart){

        int start = 0;
        int end = nums.length-1;
        int track = (start+end)/2;
        while(start<=end){
            if(nums[track]>target){
                end = track-1;
                track = (start+end)/2;
            }else if(nums[track]<target){
                start = track+1;
                track = (start+end)/2;
            } else if(findingStart) {
                end = track-1;
                track = (start+end)/2;
            } else {
                start = track+1;
                track = (start+end)/2;
            }
        }
        return track ; 

    }
}