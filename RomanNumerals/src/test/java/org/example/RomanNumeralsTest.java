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

    @Test
    public void testIntTo1330(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MCCCXXX", romanNumerals.convert(1330));
    }
    @Test
    public void testIntTo4440(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMCDXL", romanNumerals.convert(4440));
    }

    @Test
    public void testIntTo7880(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMMMMDCCCLXXX", romanNumerals.convert(7880));
    }

    @Test
    public void testIntTo3990(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMCMXC", romanNumerals.convert(3990));
    }

    @Test
    public void testIntTo1333(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MCCCXXXIII", romanNumerals.convert(1333));
    }
    @Test
    public void testIntTo4444(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMCDXLIV", romanNumerals.convert(4444));
    }

    @Test
    public void testIntTo7888(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMMMMDCCCLXXXVIII", romanNumerals.convert(7888));
    }

    @Test
    public void testIntTo3999(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMCMXCIX", romanNumerals.convert(3999));
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
