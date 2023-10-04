package recursionarr;
import java.util.Arrays;

public class bubblesort {

 // i is inner loop 
 // j is outer loop 

 public static void main(String[] args) {
    int[] arr = {5,4,3,1,2,-1};
    System.out.println(Arrays.toString(bubble(arr)));
 }

 static int[] bubble(int[] arr){
    return helperbubble( arr,0,arr.length-2); //we will ++ the outer for comparision 
 }

 static int[] helperbubble(int[] arr,int i ,int j){

    if (j<0) return arr;
    if (i>j)  return helperbubble(arr, 0, --j);

    if(arr[i]>arr[i+1]) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp ;
    }

    return helperbubble(arr, ++i, j);
    


    


 }
    
}
 