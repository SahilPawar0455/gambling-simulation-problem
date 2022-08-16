package com.bridgelabz;

public class GamblingSimulation {
    public static int stakeOfEveryDay = 100;
    public static final int Bet_Every_Game = 1;
    public static final int Days = 20;
    public static final int win = 1;

    public static void main(String[] args) {
        System.out.println("Welcome the Gambling Simulation Problem");
        playGame();
    }

    public static void playGame() {
        for (int i = 1; i <= Days; i++) {
            int handCash = stakeOfEveryDay;
            while (handCash > 50 && handCash < 150) {
                int bit = (int) (Math.random() * (2) + 1);
                if (bit == win) {
                    System.out.println("You are win");
                    handCash++;
                } else {
                    System.out.println("You are Loss");
                    handCash--;
                }
                System.out.println("Now your stake is " + handCash);
            }
            if (handCash == 50) {
                System.out.println("You have loss 50% stake");
            } else {
                System.out.println("You Have Win 50% stake");
            }
        }
    }
}
