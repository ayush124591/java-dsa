//this code works for squre matrix 
//no of rows is same as 
//no of elements in each row 


import java.util.Arrays;

public class logncomplexity {

    public static void main(String[] args) {
        int[][] nums = {
            {2,4,7},
            {9,13,15},
            {20,22,25}
        };
        int target = 2;
        int colnumber = searchmat(nums,target);
        int[] result = searchinrow(nums[colnumber],target,colnumber);
        System.out.println(Arrays.toString(result));
    }

    public static int searchmat(int[][] matrix,int target){

        int col = matrix.length-1;
        int sr = 0 ;
        int er = matrix.length-1;
        int mid=(sr+er)/2;
        while(sr!=er){
            if(target == matrix[mid][col]) return  mid;
            else if(target>matrix[mid][col]){
                sr = mid +1;
                mid = (sr+er)/2;

            }else {
                er = mid;
                mid = (sr+er)/2;
            }


        }        
             if(sr == er ) return mid;  
        return -1;

    }

    //return -1,-1 if not found
    public static int[] searchinrow(int[] row,int target,int col){
        int start = 0;
        int end = row.length-1;
        int mid =(start+end)/2;
        while(start<=end){
            if(row[mid]==target) return new int[] {mid,col};
            else if(row[mid]>target){
                end=mid-1;
                mid = (start+end)/2;
            }else {
                start = mid+1;
                mid = (start+end)/2;
            }
        }
        return new int[] {-1,-1};
    }
    
}
