package recursionarr;

import java.util.ArrayList;

public class linearsearchmulitpleoccurences {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7};
        System.out.println(finder(arr,2));      
  }

    public static ArrayList<Integer> finder(int[] arr, int targer){
        ArrayList<Integer> list = new ArrayList<>();
        return finderhelper(arr, targer, 0,list);
    }

    public static ArrayList<Integer> finderhelper(int[] arr, int target,int index , ArrayList<Integer> list){
      if(arr[index]==target) list.add(index);
      if(index==arr.length-1) return list;
      return finderhelper(arr,target,++index,list);
    }
}

