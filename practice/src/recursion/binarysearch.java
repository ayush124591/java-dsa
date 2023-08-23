package recursion;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int x = search(arr,0,4,6);
        System.out.println(x);
    }

    public static int search(int[] arr,int start,int end,int target){
        int mid = (start+end)/2;
        if(start>end) return -1 ;
        if(arr[mid]==target) return mid;  
        else if(arr[mid]<target){
            return search(arr,mid+1,end,target);

        }else {
             return search(arr,start,mid-1,target);
        }
        
    }
}
