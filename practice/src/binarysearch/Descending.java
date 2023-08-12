package binarysearch;

//simply change the start and end in greater than and less than cases
public class Descending {
    public static void main(String[] args) {
        int[] arr = {10,9,7,5,2};
        int target = 9;
        int start=0;
        int end = arr.length-1;
        int check = (start+end)/2;
       
        while( start <= end ){
            if(target == arr[check]){
                System.out.println("position at "+check);
                break;
            }else if(arr[check]>target){
                start = check+1;
                check = (start + end)/2;
               continue;}
            else {
                end = check-1;
                check = (start+end)/2;
               
            }
                    
            
            }
    
            if(start>end) System.out.println("element not found");
         
        }
    }

    