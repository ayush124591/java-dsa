package recursionarr;
import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {
        int[] arr = {3,1,2};
      
        System.out.println(Arrays.toString(bubblesort(arr)));
    }

    static int[] bubblesort(int[] arr){
        for (int i = arr.length-2 ; i >=0 ; --i) {
            for (int j = 0; j <= i; ++j) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;                }
                
            }
        }
        return arr;
    }
    
}
