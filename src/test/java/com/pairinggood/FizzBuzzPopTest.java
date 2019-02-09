package com.pairinggood;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzPopTest {

    @Test
    public void calculate_ShouldReturnPop_WhenGivenTheNumberSeven() {
        FizzBuzzPop fizzBuzzPop = new FizzBuzzPop();

        String actual = fizzBuzzPop.calculate(7);

        assertEquals("pop", actual);
    }
}
