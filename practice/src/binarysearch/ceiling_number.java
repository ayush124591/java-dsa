package binarysearch;
public class ceiling_number{
    public static void main(String[] args) {
        int[] arr = {7,7,7,7,7,7,7,7,7,7};
        int target = 7;
        int start=0;
        int end = arr.length-1;
        int check = (start+end)/2;
       
        while( start <= end ){
         
             if(arr[check]>target){
                end = check-1;
                check = (start + end)/2;
               continue;}
            else {
                start = check+1;
                check = (start+end)/2;
               
            }
                    
            
            }
    
            System.out.println(arr[start]);
        }
    }
