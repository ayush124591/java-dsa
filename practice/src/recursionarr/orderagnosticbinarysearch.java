package recursionarr;

public class orderagnosticbinarysearch {

    public static void main(String[] args) {
        int[] arr = {6,-2,-11};
        System.out.println("at index "+bs(arr,-11));
    }

    public static int bs(int[] arr, int target){
        return bssearcher(arr,target,0,arr.length-1);
    }

    public static int bssearcher(int[] arr, int target , int start , int end ){
        boolean reversed = false ; 
        if(arr[start] > arr[end] ) reversed = true ; ;
        int mid = start + (end-start)/2;
        if(target==arr[mid]) return mid ;
        if(target>arr[mid]) {
         if(!reversed)  return bssearcher(arr, target, mid+1, end);
         else return bssearcher(arr, target, start, mid-1);
        }
            else {
                if(!reversed) return bssearcher(arr, target, start,mid-1);
                else return bssearcher(arr, target, mid+1, end);
    }
}
    
    
}
