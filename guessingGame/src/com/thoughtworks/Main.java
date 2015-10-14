package com.thoughtworks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String result = "no";
        int target = (int) (Math.random() * 10);

        while (result != "correct") {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your guess (from 0 to 10): ");
            int guess = input.nextInt();

            Guesser game = new Guesser(target);
            result = game.check(guess);

            System.out.println(result);
        }
        System.out.println("Game over!");
    }
}
