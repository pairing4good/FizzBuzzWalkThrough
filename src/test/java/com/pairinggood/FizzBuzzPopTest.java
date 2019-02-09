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

    @Test
    public void calculate_ShouldReturnPop_WhenGivenMultipleOfSeven() {
        FizzBuzzPop fizzBuzzPop = new FizzBuzzPop();

        String actual = fizzBuzzPop.calculate(28);

        assertEquals("pop", actual);
    }

    @Test
    public void calculate_ShouldReturnTheOriginalNumber_WhenGivenNumberOtherThanSeven() {
        FizzBuzzPop fizzBuzzPop = new FizzBuzzPop();

        String actual = fizzBuzzPop.calculate(1);

        assertEquals("1", actual);
    }
}
