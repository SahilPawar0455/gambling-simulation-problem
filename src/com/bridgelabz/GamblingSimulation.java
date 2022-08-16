package com.bridgelabz;

public class GamblingSimulation {
    public static int stakeOfEveryDay = 100;
    public static int betEveryGame = 1;
    public static int win = 1;

    public static void main(String[] args) {
        System.out.println("Welcome the Gambling Simulation Problem");
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
}
