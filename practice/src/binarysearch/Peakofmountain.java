package binarysearch;

public class Peakofmountain {
    public static void main(String[] args) {
        int[] arr = {1,3};
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;
        while(end>=start){
            if(mid == 0 ){
                if(arr[0]<arr[1]) {mid = 1;break;}
                else {mid = 0 ;break;}
            }
            if (mid == arr.length-1){
                if(arr[arr.length-1]>arr[arr.length-2]) {mid =  arr.length-1;break;}
                else {mid= arr.length-2; break;}
            }
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                System.out.println(arr[mid]);
                break;
            }   else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                start = mid+1;
                mid = start + (end - start)/2;
                continue;
            }else {
                end = mid-1;
                mid = start + (end-start)/2;
            }
           


        }
         System.out.println(arr[mid]);
       
    }
    
}
