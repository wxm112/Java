package com.thoughtworks;

/**
 * Created by mayw on 14/10/2015.
 */
public class Guesser {


    private final int target;

    public Guesser(int target) {
        this.target = target;
    }

    public String check(int guess) {
        if(guess > 10 || guess < 0) {
            return "Wrong number!!";
        }
        if (guess < target) {
            return "too low";
        }
        if (guess > target) {
            return "too high";
        } else return "correct";
    }
}
