package recursionsorting;

import java.util.Arrays;

public class selectionsort {

    public static void main(String[] args) {
        int[] arr = {2,3,1,5,4,-1};
        System.out.println(Arrays.toString(selection(arr)));
    }

    static int[] selection(int[] arr){
        return selectionhelper(arr,0,arr.length-1,0);
    }

    //i is inner loop 
    //j is outer loop
    static int[] selectionhelper(int[] arr,int i , int j , int high,int ){

        
        //base con
        if(j==0) return arr;
        if(i==j) 
        {
            int temp = arr[i];
            arr[i] = arr[high];
            arr[high] = temp ;
            
        return selectionhelper(arr, 0, --j, 0);
        }

        if(arr[i]>arr[i+1]) high = i ; 
        return selectionhelper(arr,++i,j,high);

    }
    
}
