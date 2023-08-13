package binarysearch;
public class Attempt{
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,13,16,17,143};
        int target = 1;
        int start=0;
        int end = arr.length-1;
        int check = (start+end)/2;
       
        while( start <= end ){
            if(target == arr[check]){
                System.out.println("position at "+check);
                break;
            }else if(arr[check]>target){
                end = check-1;
                check = (start + end)/2;
               continue;}
            else {
                start = check+1;
                check = (start+end)/2;
               
            }
                    
            
            }
    
            if(start>end) System.out.println("element not found");
         
        }
    }







        int start=0;
        int end = nums.length-1;
        int check = (start+end)/2;
        //start and end index
        int x,y = 0;
       
        while( start <= end ){
            if(target == nums[check]){
                x = y = check ;
                for(int z = check-1;z>=0;z--){
                    if(nums[z]==target) x = z;
                }
                for(int z=check+1;z<nums.length;z++){               if(nums[z]==target) y=z;

                }
                return new int[] {x,y};
            }else if(nums[check]>target){
                end = check-1;
                check = (start + end)/2;
               continue;}
            else {
                start = check+1;
                check = (start+end)/2;
               
            }
                    
            }
            return new int[] {-1,-1};

    }
