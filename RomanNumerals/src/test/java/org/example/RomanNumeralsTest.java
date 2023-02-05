package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {
    @Test
    public void testIntTo1000(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("M", romanNumerals.convertNumberToNumeral(1000));
    }
    @Test
    public void testIntTo4000(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMM", romanNumerals.convertNumberToNumeral(4000));
    }

    @Test
    public void testIntTo7000(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMMMM", romanNumerals.convertNumberToNumeral(7000));
    }

    @Test
    public void testIntTo1300(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MCCC", romanNumerals.convertNumberToNumeral(1300));
    }
    @Test
    public void testIntTo4400(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMCD", romanNumerals.convertNumberToNumeral(4400));
    }

    @Test
    public void testIntTo7800(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMMMMDCCC", romanNumerals.convertNumberToNumeral(7800));
    }

    @Test
    public void testIntTo3900(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMCM", romanNumerals.convertNumberToNumeral(3900));
    }

    @Test
    public void testIntTo1330(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MCCCXXX", romanNumerals.convertNumberToNumeral(1330));
    }
    @Test
    public void testIntTo4440(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMCDXL", romanNumerals.convertNumberToNumeral(4440));
    }

    @Test
    public void testIntTo7880(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMMMMDCCCLXXX", romanNumerals.convertNumberToNumeral(7880));
    }

    @Test
    public void testIntTo3990(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMCMXC", romanNumerals.convertNumberToNumeral(3990));
    }

    @Test
    public void testIntTo1333(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MCCCXXXIII", romanNumerals.convertNumberToNumeral(1333));
    }
    @Test
    public void testIntTo4444(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMCDXLIV", romanNumerals.convertNumberToNumeral(4444));
    }

    @Test
    public void testIntTo7888(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMMMMDCCCLXXXVIII", romanNumerals.convertNumberToNumeral(7888));
    }

    @Test
    public void testIntTo3999(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMCMXCIX", romanNumerals.convertNumberToNumeral(3999));
    }


    @Test
    public void testIntoToNumeral1(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MCCXXXIV", romanNumerals.convertNumberToNumeral(1234 ));
    }

    @Test
    public void testIntoToNumeral2(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("MMMMCCCXXI", romanNumerals.convertNumberToNumeral(4321 ));
    }

}
