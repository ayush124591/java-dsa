import java.util.Arrays;

public class ncomplexity{
    public static void main(String[] args) {
        int[][] matrix = {
            {1,5,7},
            {8,10,13},
            {9,12,17}
        };
        int target = 50;
        int[] ans = searcher(matrix,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searcher(int[][] matrix,int target){
        int row = 0;
        int col = matrix.length  -1;
        while(row<matrix.length-1 && col>=0){
            if(matrix[row][col]==target) return new int[] {row,col};
            if(matrix[row][col]<target) row++;
            else col--;

        }
        return new int[] {-1,-1};

    }
}