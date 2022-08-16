package com.bridgelabz;

public class GamblingSimulation {
    public static int stakeOfEveryDay = 100;
    public static final int Bet_Every_Game = 1;
    public static final int win = 1;

    public static void main(String[] args) {
        System.out.println("Welcome the Gambling Simulation Problem");
        playGame();
    }

    public static void playGame() {
        while (stakeOfEveryDay > 50 && stakeOfEveryDay < 150) {
            int bit = (int) (Math.random() * (2) + 1);
            if (bit == win) {
                System.out.println("You are win");
                stakeOfEveryDay++;
            } else {
                System.out.println("You are Loss");
                stakeOfEveryDay--;
            }
            System.out.println("Now your stake is " + stakeOfEveryDay);
        }
        if (stakeOfEveryDay == 50){
            System.out.println("You have loss 50% stake");
        }else {
            System.out.println("You Have Win 50% stake");
        }
    }
}
