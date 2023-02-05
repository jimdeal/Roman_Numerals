package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {
    @Test
    public void testIntTo1000(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("M", romanNumerals.convert(1000));
    }
    @Test
    public void testIntTo4000(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMM", romanNumerals.convert(4000));
    }

    @Test
    public void testIntTo7000(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMMMM", romanNumerals.convert(7000));
    }

    @Test
    public void testIntTo1300(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MCCC", romanNumerals.convert(1300));
    }
    @Test
    public void testIntTo4400(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMCD", romanNumerals.convert(4400));
    }

    @Test
    public void testIntTo7800(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMMMMDCCC", romanNumerals.convert(7800));
    }

    @Test
    public void testIntTo3900(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMCM", romanNumerals.convert(3900));
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
