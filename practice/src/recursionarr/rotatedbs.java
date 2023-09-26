package recursionarr;

public class rotatedbs {
    public static void main(String[] args) {
    
        int[] arr = {4,5,6,7,8,9,1} ;
        System.out.println(search(arr,7));
    }

    public static int search(int[] arr, int target){
        return helper(arr,target,0,arr.length-1);
    }

    public static int helper(int[] arr,int target,int start,int end){

        int mid = start + (end-start)/2;
        
        if(arr[mid] == target ) return mid ;
        if(start>end) return -1;
        if(arr[start]<arr[mid]){

            if(arr[start]<=target && arr[mid]>=target) return helper(arr,target,start,mid-1);

            else return helper(arr,target,mid+1,end);

        }

        if (target>= arr[mid] && target<= arr[end]) return helper(arr,target,mid+1,end);

        else return  helper(arr,target,start,mid-1);

    }



     }