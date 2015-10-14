package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mayw on 14/10/2015.
 */
public class GuesserTest {
    Guesser game = new Guesser(4);


    @Test
    public void testTooLow() {
        int guess = 3 ;
        assertThat(game.check(guess), is("too low"));
    }
    @Test
    public void testTooHigh(){
        int guess = 5 ;
        assertThat(game.check(guess), is("too high"));
    }

    @Test
    public void testCorrect() {
        int guess = 4 ;
        assertThat(game.check(guess), is("correct"));
    }

    @Test
    public void testLessThan0() {
        int guess = -1 ;
        assertThat(game.check(guess), is("Wrong number!!"));
    }

    @Test
    public void testBiggerThan10() {
        int guess = 11;
        assertThat(game.check(guess), is("Wrong number!!"));
    }
}
