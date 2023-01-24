package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {

        boolean positiveNumber = (Integer.parseInt(str) >= 0);
        return positiveNumber;
        //code!
    }
}
