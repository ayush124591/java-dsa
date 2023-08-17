package binarysearch;
public class Rotatedsorted{
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,-1,1};
        int target = 3;
        int ans = -1;
        int start = 0 ;
        int end = nums.length-1;

        int mid = (start+end)/2;
        boolean foundpeak = false ;
        int checkthis=0 ;
        int peak = -1;
        //finding peak
        while(start<=end){
            checkthis = nums[mid] ;
            if(checkthis>nums[mid-1]&&checkthis<nums[mid+1]){
                start = mid + 1;
                mid = start + (end-start)/2;
                 System.out.println("first start is"+start+" end is "+end + " middle is "+mid);
            }else if(checkthis<nums[mid-1]&&checkthis>nums[mid+1]){
                end = mid-1;
                mid = start + (end-start)/2;
                 System.out.println("second start is"+start+" end is "+end + " middle is "+mid);
            }else if (checkthis > nums[mid-1] && checkthis > nums[mid+1]){
                peak = nums[mid] ; 
                 System.out.println("last start is"+start+" end is "+end + " middle is "+mid);
                break ;
            }
            System.out.println("start is"+start+" end is "+end + " middle is "+mid);
    }
    System.out.println(peak);
    }
}