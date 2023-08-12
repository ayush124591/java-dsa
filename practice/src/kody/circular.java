package kody;
import java.util.Scanner;
public class circular {
    public static void main(String[] args) {
        System.out.println("you are going north : ");
        System.out.println("options :- ");
        System.out.println("type x to end ");
        System.out.println("type l to take a left ");
        System.out.println("type r to take a right");
        System.out.println("type m to keep going");
        int[] directions = {0,0,0,0,0,0};//forward left right trackwest track2east south
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("your journey begins (enter command):- ");
        String direction = input.next();

        while (direction != "x" || direction !="X"){
            if(direction == "m" || direction == "M"){
                if(directions[3] > 0){
                    directions[1] += 1;
                }
                if(directions[4]>0){
                    directions[2] += 1;
                }
                else if(directions[5] != 0) {
                    directions[0] += 1;
                }else {
                    directions[0] -= 1;
                }
            }


            if(direction == "l" || direction == "L"){

                if(directions[3] > 0){
                    directions[3] = 0;
                    directions[0] -= 1;
                }
                if(directions[4]>0){
                    directions[4] = 0 ;
                    directions[0] += 1;
                }
                else {
                    directions[1] += 1;
                    directions[3] += 1;
                }

            }

            if(direction == "r" || direction == "R"){

                if(directions[3] > 0){
                    directions[3] = 0;
                    directions[0] += 1;
                }
                if(directions[4]>0){
                    directions[4] = 0 ;
                    directions[0] -= 1;
                }
                else {
                    directions[2] += 1;
                }

            }


        }


    }
}
