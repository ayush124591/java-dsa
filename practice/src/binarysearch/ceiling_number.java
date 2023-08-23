package binarysearch;
public class ceiling_number{
    public static void main(String[] args) {
        int[] arr = {7,7,7,7,7,7,7,7,7,7,7,8,8};
        int target = 4;
        int start=0;
        int end = arr.length-1;
        int check = (start+end)/2;
       
        while( start <= end ){
            if(target == arr[check]){
                System.out.println(arr[check]);
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
    
            System.out.println(arr[start]);
         
        }
    }
