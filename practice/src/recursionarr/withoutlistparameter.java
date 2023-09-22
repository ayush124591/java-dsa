package recursionarr;

import java.util.ArrayList;
import java.util.Arrays;

public class withoutlistparameter {
       public static void main(String[] args) {
        int[] arr = {2};
        System.out.println(arr.length);
        System.out.println(finder(arr,2));      
  }

    public static ArrayList<Integer> finder(int[] arr, int targer){
        return finderhelper(arr, targer, 0);
    }

    public static ArrayList<Integer> finderhelper(int[] arr, int target,int index ){

        ArrayList<Integer> list = new ArrayList<>();
        
        if(index == arr.length){
            return list ;
        }
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ans = finderhelper(arr,target,++index);
        list.addAll(ans);
        return list;

    }
    
}
