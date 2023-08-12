package arrays;

import java.util.Scanner;
import java.util.Arrays;
public class input_output {
    //input and output an multidimentional array
    //and ask user for dimentions

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number of rows : ");
        int row = input.nextInt();
        System.out.println("enter number of columns : ");
        int col = input.nextInt();

        int[][] arr = new int[row][col];
        for(int x=0;x<row;++x){
            for(int y=0;y<col;++y){
                arr[x][y] = input.nextInt();
            }
        }

    }

}
