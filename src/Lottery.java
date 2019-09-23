// Hamza Yousaf
// 9/22/2019
// Write a lottery program. Chapter 3, exercise 3.15

import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        // create Scanner
        Scanner input = new Scanner(System.in);

        int lottery = 100 + (int) (Math.random() * (999-100+1));

        // prompt user
        System.out.println("Enter you lottery pick: ");

        // read user guess as input
        int guess = input.nextInt();

        // get lottery digits
        int lottery1 = lottery;
        int lotteryUnitDigit = lottery1 % 10;
        lottery1 = lottery1 / 10;
        int lotteryTenDigit = lottery1 % 10;
        lottery1 = lottery1 / 10;
        int lotteryHundredDigit = lottery1;

        // get user guess digits
        int guess1 = guess;
        int userUnitDigit = guess1 % 10;
        guess1 = guess1 / 10;
        int userTenDigit = guess1 % 10;
        guess1 = guess1 / 10;
        int userHundredDigit = guess1;

        // Display Result
        if (lottery == guess) {
            if (lottery == guess) {
                System.out.println("Exact Match: you win: $10,000");
               }
            else if (((lotteryUnitDigit == userUnitDigit) ||
                    (lotteryUnitDigit == userTenDigit) ||
                    (lotteryUnitDigit == userHundredDigit)) &&
                    ((lotteryTenDigit == userUnitDigit) ||
                    (lotteryTenDigit == userTenDigit) ||
                    (lotteryTenDigit == userHundredDigit)) &&
                    ((lotteryHundredDigit == userTenDigit) ||
                            (lotteryHundredDigit == userHundredDigit)))
            {
                System.out.println("All Digits Match: You win: $3,000");
            } else if (lotteryUnitDigit == userUnitDigit ||
                        lotteryUnitDigit == userTenDigit ||
            lotteryUnitDigit == userHundredDigit ||
            lotteryTenDigit == userUnitDigit ||
            lotteryTenDigit == userTenDigit ||
            lotteryTenDigit == userHundredDigit ||
            lotteryHundredDigit == userUnitDigit ||
            lotteryHundredDigit == userTenDigit ||
            lotteryHundredDigit == userHundredDigit)
            {
                System.out.println("Match one digit: You win: $1,000");
            }
        }
    }
}
