package sorting;

import java.util.Arrays;
//get max index 
// swap it with last index 
public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        for(int i=0 ; i<arr.length;i++){
            int last = arr.length -1 -i; 
            int maxIndex = getMaxIndex(arr,0,last);
            swap( arr,maxIndex,last);
            System.out.println(Arrays.toString(arr));

        }
        System.out.println(Arrays.toString(arr));

    }

    static int getMaxIndex(int[] arr,int start,int end){
        int max = start ; 
        for(int x = 0 ;x<=end;++x){
            if(arr[x]>arr[max]){
                max = x;
            }
        }
        return max ; 

    }

    static void swap (int[] arr,int maxIndex,int last){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp ; 
    }
}
