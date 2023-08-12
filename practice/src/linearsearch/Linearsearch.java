package linearsearch;

public class Linearsearch {

    public static void main(String[] args) {
        int[] nums = {12 ,34 ,3 ,5 ,243,78,3,-4,-2,-13,3,0};
        int target = 3 ;
        int andind = linearSearch(nums,target);
        System.out.println(andind);
    }

    // return index if found
    // else return -1
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0 ){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
