////////////////////////////////////////////////////////////////////
// Osama Chelhaoui 2042333
// Giovanni Ponso 2000558
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvertOnetoRoman(){
        assertEquals("I", IntegerToRoman.convert(1));
    }
    @Test
    public void testConvertThreetoRoman(){
        assertEquals("III", IntegerToRoman.convert(3));
    }
    @Test
    public void testConvertFourtoRoman(){
        assertEquals("IV", IntegerToRoman.convert(4));
    }
    @Test
    public void testConvertFivetoRoman(){
        assertEquals("V", IntegerToRoman.convert(5));
    }
    @Test
    public void testConvertNinetoRoman(){
        assertEquals("IX", IntegerToRoman.convert(9));
    }
    @Test
    public void testConvertTentoRoman(){
        assertEquals("X", IntegerToRoman.convert(10));
    }
    @Test
    public void testConvertFourtytoRoman(){
        assertEquals("XL", IntegerToRoman.convert(40));
    }
    @Test
    public void testConvertFiftytoRoman(){
        assertEquals("L", IntegerToRoman.convert(50));
    }
    @Test
    public void testConvertNinetytoRoman(){
        assertEquals("XC", IntegerToRoman.convert(90));
    }
    @Test
    public void testConvertOneHundredtoRoman(){
        assertEquals("C", IntegerToRoman.convert(100));
    }
    @Test
    public void testConvertFourHundredtoRoman(){
        assertEquals("CD", IntegerToRoman.convert(400));
    }
    @Test
    public void testConvertFiveHundredtoRoman(){
        assertEquals("D", IntegerToRoman.convert(500));
    }
    @Test
    public void testConvertNineHundredtoRoman(){
        assertEquals("CM", IntegerToRoman.convert(900));
    }
    @Test
    public void testConvertOneThousandtoRoman(){
        assertEquals("M", IntegerToRoman.convert(1000));
    }
    @Test(expected = NumberFormatException.class)
    public void testConvertStringtoRoman(){
        IntegerToRoman.convert(Integer.parseInt("a"));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testConvertNumberMinorOnetoRoman(){
        IntegerToRoman.convert(0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testConvertNumberMajorOneThousandtoRoman(){
        IntegerToRoman.convert(1001);
    }
}