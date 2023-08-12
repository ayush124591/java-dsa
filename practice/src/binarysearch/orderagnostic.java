package binarysearch;

public class orderagnostic {
    public static void main(String[] args) {
        int[] arr={-12,-2,0,1,2};
        int target = 2;
        System.out.println(orderAgnosticBS(arr, target));
        
    }

    static int orderAgnosticBS(int[] arr,int target){
        int start = 0 ;
        int end = arr.length - 1;
        int check = (start+end)/2;
        boolean isAsc = arr[end]>arr[start];
        while(!(start>end)){
            if(arr[check]==target) return check;
            if(isAsc){
                if(arr[check]>target){
                    end = check-1;
                    check = (start+end)/2;
                }else{
                    start = check+1;
                    check = (start+end)/2;
                }

            }else{//desending
                   if(arr[check]<target){
                    end = check-1;
                    check = (start+end)/2;
                }else{
                    start = check+1;
                    check = (start+end)/2;
                }
                
            }

        }

    return -1;//nothing was found
}
}
