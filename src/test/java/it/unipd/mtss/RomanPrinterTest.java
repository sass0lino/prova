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
    
}
