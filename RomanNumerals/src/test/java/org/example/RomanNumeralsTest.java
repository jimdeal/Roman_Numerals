package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {
    @Test
    public void testIntTo1000(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("M", romanNumerals.convert(1000));
    }
    public void testIntTo4000(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMM", romanNumerals.convert(4000));
    }

    public void testIntTo7000(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMMMM", romanNumerals.convert(7000));
    }


/*
    @Test
    public void testIntToLessThan10_1(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I", romanNumerals.convert(1));
    }

    @Test
    public void testIntToLessThan10_3(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("III", romanNumerals.convert(3));
    }

    @Test
    public void testIntToLessThan10_7(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("VII", romanNumerals.convert(7));
    }

 */

}
