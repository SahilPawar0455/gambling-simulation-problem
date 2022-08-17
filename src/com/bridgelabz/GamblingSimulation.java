package com.bridgelabz;

import java.util.Scanner;

public class GamblingSimulation {
    public static int stakeOfEveryDay = 100;
    public static int winDays = 0;
    public static int lossDays = 0;
    public static boolean condition = true;
    public static final int DAYS = 20;
    public static final int WIN = 1;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome the Gambling Simulation Problem");
        playGame();
        nextMonth();
    }

    public static void nextMonth() {
        while (condition) {
            System.out.println("choose the option \n1. Enter the 1 for play Again \n2. Enter the 2 for Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Game is start Again");
                    playGame();
                    break;
                case 2:
                    System.out.println("Game is Over ");
                    condition = false;
                    break;
                default:
                    System.out.println("Please Enter the valid Number");
            }
        }
    }

    public static void playGame() {
        for (int i = 1; i <= DAYS; i++) {
            int handCash = stakeOfEveryDay;
            int perDayWin = 0;
            int perDayLoss = 0;
            int stakeOf50PercentageLoss = stakeOfEveryDay / 2;
            int stakeOf50PercentageWin = stakeOfEveryDay + stakeOf50PercentageLoss;
            while (handCash > stakeOf50PercentageLoss && handCash < stakeOf50PercentageWin) {
                int bit = (int) (Math.random() * (2) + 1);
                if (bit == WIN) {
                    System.out.println("You are win");
                    handCash++;
                    perDayWin++;
                } else {
                    System.out.println("You are Loss");
                    handCash--;
                    perDayLoss++;
                }
                System.out.println("Now your stake is " + handCash);
                System.out.println("Your Have Win " + perDayWin + " bet and you have loss " + perDayLoss + " bet");
            }
            if (handCash == 50) {
                System.out.println("You have loss 50% stake");
                winDays++;
            } else {
                System.out.println("You Have Win 50% stake");
                lossDays++;
            }
        }
        winLossDays();
    }

    public static void winLossDays() {
        System.out.println("luckiest day in this month is = " + winDays);
        System.out.println("unluckiest day in this month is = " + lossDays);
    }
}
