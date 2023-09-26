package recursionarr;


//simple binary search using recursion 
// array is ascending sorted 
public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("at index"+bs(arr,6));
    }

    public static int bs(int[] arr, int target){
        return bssearcher(arr,target,0,arr.length-1);
    }

    public static int bssearcher(int[] arr, int target , int start , int end ){
        if(start > end ) return -1;
        int mid = start + (end-start)/2;
        if(target==arr[mid]) return mid ;
        if(target>arr[mid]) return bssearcher(arr, target, mid+1, end);
        else return bssearcher(arr, target, start,mid-1);
    }
    
    
}
