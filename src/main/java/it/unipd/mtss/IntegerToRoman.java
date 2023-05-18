////////////////////////////////////////////////////////////////////
// Osama Chelhaoui 2042333
// Giovanni Ponso 2000558
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.TreeMap;

public class IntegerToRoman {/////
    private IntegerToRoman() {}

    private static final TreeMap<Integer, String> map = new TreeMap<>();
    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public static String convert(int number){
        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException("Il numero è maggiore di 1000");
        }
        int roman = map.floorKey(number);
        if (number == roman) {
            return map.get(number);
        }
        return map.get(roman) + convert(number - roman);
    }
}
