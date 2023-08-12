package kody;
import java.util.ArrayList;
import java.util.Scanner;
public class permutaions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("enter 3 distinct number :- ");
        for(int x = 0 ;x<3;++x){
            arr[x] = input.nextInt();
        }

        for(int l=0;l<arr.length;++l){
            for(int j=0;j<arr.length;++j){
                if(l==j){continue;}
                for(int k=0;k<arr.length;++k){
                    if(k==l || k==j){continue;}
                    printthis(arr,l,j,k);
                }
            }

        }}
        static void printthis(int[] arr, int l,int j,int k){
            int one = arr[l];
            int two = arr[j];
            int three = arr[k];
            System.out.println(one + " " + two + " " + three );
        }


    }
