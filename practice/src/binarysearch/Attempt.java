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
