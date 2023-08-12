package linearsearch;

import java.util.ArrayList;
import java.util.Arrays;
public class Search2darrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,4,5,6},
                {13,14,161,19,11,12},
                {22,24,21,29},
                {31,33,39}
        };
        int target = 11;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println("max is "+max(arr));
    }

    static int max(int[][] arr){
        int max = arr[0][0];
      for(int[] x : arr){
          for(int y : x){
              if(y>max){
                  max = y;

              }

          }

      }
      return max;
    }
    static int[] search(int[][] arr,int target){

        for(int x=0;x<arr.length;++x){
            for(int y=0;y<arr[x].length;++y){
                if(arr[x][y] == target){
                    return new int[]{x,y};
                }

            }
        }
        return new int[]{-1,-1};
    }
}
