package com.CodeWithAkash;
import java.util.Scanner;
import java.util.Random;
public class making_RPS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        /*
        For choosing "Rock" enter 0
        For choosing "Scissor" enter 1
        For choosing "Paper" enter 2
         */

        int computerInput = random.nextInt(3);
        System.out.print("Enter your input:-");
        int num = sc.nextInt();
        if(num == 0 && computerInput == 1 || num == 1 && computerInput == 2 || num == 2 && computerInput == 0){
            System.out.println("Congratulation! you have won");
        }else if( num == computerInput) {
            System.out.println("Match is draw");
        }else{
                System.out.println("You loose ");
            }
        System.out.println("Computer input was :- " + computerInput);
    }
}

