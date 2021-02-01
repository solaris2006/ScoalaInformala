package teme;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        int tries = 0;
        int prevNum = 0;
        int secretNum = (int) Math.floor((Math.random() * 20) + 1);
        System.out.println("Please guess the secret number between 1 and 20");

        int i = 0;

        while (isRunning) {
            int num = sc.nextInt();
            if (num < secretNum) {
                System.out.println("The number is to low. Try again");
                if (num != prevNum) {
                    prevNum = num;
                    tries++;
                }
            } else if (num > secretNum) {
                System.out.println("The number is too high . Try again");
                if (num != prevNum) {
                    prevNum = num;
                    tries++;
                }
            } else {
                System.out.println("You have guessed the number");
                if (num != prevNum) {
                    prevNum = num;
                    tries++;
                }
                isRunning = false;
            }
        }
        System.out.println("The number of tries were " + tries);
    }
}
