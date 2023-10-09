package recursionsorting;
import java.util.Arrays;
public class mergesort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,1,2,-3,10,45};
        System.out.println(Arrays.toString(mergesort(arr)));
    }

    public static int[] mergesort(int[] arr){
        if(arr.length == 1) return arr;
        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr, 0,mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merger(mergesort(left) , mergesort(right));
    }

    public static int[] merger(int[] left,int[] right){
        int lpoint = 0 ;
        int rpoint = 0 ;
        int mixpoint = 0 ;
        int[] mix = new int[left.length+right.length]; 
        while(lpoint<left.length && rpoint<right.length){
            
            if(left[lpoint]<right[rpoint]){
                mix[mixpoint] = left[lpoint];
                ++lpoint;
                ++mixpoint;
            }else {
                mix[mixpoint] = right[rpoint];
                ++rpoint;
                ++mixpoint;
            }
        }
        
        int[] leftover = {};
        //now to add leftovers i run a loop 
        if (lpoint==left.length) {
             leftover = Arrays.copyOfRange(right, rpoint, right.length);
        } else {
             leftover = Arrays.copyOfRange(left, lpoint, left.length);
        }

        for (int i = 0; i < leftover.length; i++) {
            mix[mixpoint] = leftover[i];
            ++mixpoint;
        }

        return mix ;
    }
    
}
