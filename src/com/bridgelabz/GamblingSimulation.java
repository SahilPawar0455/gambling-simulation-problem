package com.bridgelabz;

public class GamblingSimulation {
    public static int stakeOfEveryDay = 100;
    public static int winDays = 0;
    public static int lossDays = 0;
    public static final int DAYS = 20;
    public static final int WIN = 1;

    public static void main(String[] args) {
        System.out.println("Welcome the Gambling Simulation Problem");
        playGame();
        GamblingSimulation gamblingSimulation = new GamblingSimulation();      // creating the object
        gamblingSimulation.winLossDays();
    }

    public void winLossDays() {
        System.out.println("luckiest day in this month is = "+winDays);
        System.out.println("unluckiest day in this month is = "+lossDays);
    }

    public static void playGame() {
        for (int i = 1; i <= DAYS; i++) {
            int handCash = stakeOfEveryDay;
            int perDayWin = 0;
            int perDayLoss = 0;
            while (handCash > 50 && handCash < 150) {
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
    }
}
