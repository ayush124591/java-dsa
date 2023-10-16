package recursionsorting;
import java.util.Arrays;

class quicksort{
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        quicksort(arr);
        System.out.println(Arrays.toString(arr));        
    }

    public static void quicksort(int[] arr){
       quicksorthelp(arr,0,arr.length);
       return ;
    }

    public static void quicksorthelp(int[] arr, int low , int high){
        if(high-low < 2) return ;
        int pivot = arr[high-1];
        int temp =0 ;
        int track = low;

        //loop thorugh the whole array and keep track of i

        for (int i = low; i < high ; i++) {
            
            if(arr[i]<pivot){
                
                temp = arr[i];
                arr[i] = arr[track ];
                arr[track] = temp ;
                ++track;
            }
            
        }

        quicksorthelp(arr, low, track);
        quicksorthelp(arr, track, high);

    }


}