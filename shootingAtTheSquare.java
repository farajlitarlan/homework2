package Homeworks;

import java.util.Random;
import java.util.Scanner;


public class shootingAtTheSquare {
    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");
        Scanner sc1 = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        Random rnd = new Random();
        int rand_row = rnd.nextInt(5);
        int rand_col = rnd.nextInt(5);
        int find_row;
        int find_col;
        System.out.println( rand_row );
        System.out.println( rand_col );
        String array[][] = new String[5][5];
        int row;
        int col;
        for ( row = 0; row < 5; row++) {
            for ( col = 0; col < 5; col++) {
                array[row][col] = "- | ";
            }
        }
        while (true){
            System.out.println();
            for ( row = 0; row < 5; row++) {
                for ( col = 0; col < 5; col++) {
                    System.out.print(array[row][col] + " ");
                }
                System.out.println(" ");
            }
            System.out.println( "Please, enter raw: " );
            find_row = sc1.nextInt();
            System.out.println( "Please, enter column: " );
            find_col = sc2.nextInt();
            if(find_row>=0 && find_row<5 && find_col>=0 && find_col<5){
                if(find_row!=rand_row || find_col!=rand_col){
                    array[find_row][find_col]="* | ";
                }
                else{
                    array[find_row][find_col]="x|";
                    for ( row = 0; row < 5; row++) {
                        for ( col = 0; col < 5; col++) {
                            System.out.print(array[row][col] + " ");
                        }
                        System.out.println(" ");

                    }
                    System.out.println(" You have won!");

                    break;  }
            }
            else{
                System.out.println("Please enter the number in [0 5) interval");
            }

        }
    }
}