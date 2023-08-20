package sorting;
import java.util.Arrays;
public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {};
        for(int i= 0 ;i<arr.length-1;++i){
            for(int j=i+1;j>0;--j){
                if(arr[j]<arr[j-1]){
                    swap(arr,j);
                }else {
                    break;
                }
            }
            System.out.println(Arrays.toString(arr));

            
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int j){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp ;
    }
}
