package binarysearch;

public class Infinite_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,9,9,10,12,13,14,16,18,20,31,33,35,36,37,38,39,100}; 
        int target = 8;

        int start=0;
        int end = 5;
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
                end = (end*end)/2;
                check = (start+end)/2;
               
            }
                    
            
            }
            System.out.println(check);
    
           
        }
    }

    