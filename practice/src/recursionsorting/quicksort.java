package recursionsorting;
import java.util.Arrays;

class quicksort{
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        quicksort(arr);
        System.out.println(Arrays.toString(arr));        
    }

    public static void quicksort(int[] arr){
       quicksorthelp(arr,0,arr.length,arr.length-1);
       return ;
    }

    public static void quicksorthelp(int[] arr, int low , int high , int pivotindex ){
        if(high-low == 1) return ;
        int pivot = arr[pivotindex];
        int temp =0 ;
        
        //loop thorugh the whole array and keep track of i 
        

    }


}