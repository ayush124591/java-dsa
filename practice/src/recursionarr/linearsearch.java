package recursionarr;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(findme(arr,2));
    }

    public static int findme(int[] arr , int target ){
        return helper(arr,target,0);

    }

    static int helper(int[] arr, int target , int cindex){
        if (arr[cindex] == target) return cindex;
        if (cindex == arr.length -1) return -1;
        return helper(arr,target, cindex+1);
    }
    
}
