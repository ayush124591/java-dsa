package recursionarr;

import java.util.Arrays;
import java.util.ArrayList;

class withoutlistparameter {
    public static void main(String[] args) {
    
        int[] arr = {1,2,2,1,4,5,2};
        System.out.println(listnum(arr,2,0));
        
    }

    public static ArrayList<Integer> listnum(int[] arr , int target , int index){

        ArrayList<Integer> list = new ArrayList<Integer>();
        if(arr.length == index ) return list ;
        if(arr[index] == target ) list.add(index);
        
        list.addAll(listnum(arr,target,++index));
        return list ; 

    }

}