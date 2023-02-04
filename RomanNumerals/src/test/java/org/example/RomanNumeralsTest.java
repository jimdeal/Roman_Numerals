package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {

    @Test
    public void doTest(){
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals("I", romanNumerals.convert(1));
    }

}
