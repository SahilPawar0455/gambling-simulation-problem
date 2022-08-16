package com.bridgelabz;

public class GamblingSimulation {
    public static int stakeOfEveryDay = 100;
    public static int winDays = 0;
    public static int lossDays = 0;
    public static final int Bet_Every_Game = 1;
    public static final int Days = 20;
    public static final int Win = 1;

    public static void main(String[] args) {
        System.out.println("Welcome the Gambling Simulation Problem");
        playGame();
        GamblingSimulation gamblingSimulation = new GamblingSimulation();      // creating the object
        gamblingSimulation.winLossDays();
    }
    public void winLossDays(){
        System.out.println(winDays+" days win the game in this month");
        System.out.println(lossDays+" days loss the game in this month");
    }

    public static void playGame() {
        for (int i = 1; i <= Days; i++) {
            int handCash = stakeOfEveryDay;
            while (handCash > 50 && handCash < 150) {
                int bit = (int) (Math.random() * (2) + 1);
                if (bit == Win) {
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
                winDays++;
            } else {
                System.out.println("You Have Win 50% stake");
                lossDays++;
            }
        }
    }
}
