////////////////////////////////////////////////////////////////////
// Osama Chelhaoui 2042333
// Giovanni Ponso 2000558
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {


    @Test
    public void testCPrinter(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(100)).thenReturn("C");
            String letterC =
                    "  _____  \n"+
                    " / ____| \n"+
                    "| |      \n"+
                    "| |      \n"+
                    "| |____  \n"+
                    " \\_____| \n";

            assertEquals(letterC, RomanPrinter.print(100));
        }
    }

    @Test
    public void testDPrinter(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(500)).thenReturn("D");
            String letterD =
                    " _____   \n"+
                    "|  __ \\  \n"+
                    "| |  | | \n"+
                    "| |  | | \n"+
                    "| |__| | \n"+
                    "|_____/  \n";

            assertEquals(letterD, RomanPrinter.print(500));
        }
    }

    @Test
    public void testMPrinter(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(1000)).thenReturn("M");
            String letterM =
                    " __  __  \n"+
                    "|  \\/  | \n"+
                    "| \\  / | \n"+
                    "| |\\/| | \n"+
                    "| |  | | \n"+
                    "|_|  |_| \n";

            assertEquals(letterM, RomanPrinter.print(1000));
        }
    }
    @Test (expected = IllegalArgumentException.class)
    public void testEmptyRomanNumber(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(1)).thenReturn("");
            RomanPrinter.print(1);
        }
    }
    @Test (expected = IllegalArgumentException.class)
    public void testInvalidRomanNumber(){
        try(MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(1)).thenReturn("A");
            RomanPrinter.print(1);
        }
    }
}