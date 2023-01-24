package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String arg : args) {
            boolean positiveNumber = isPositiveNumber(arg);
            if (!positiveNumber) return false;
        }
        return true;
        //magic happens here
    }

    public static boolean isPositiveNumber(String str) {
        if (str == null || str.startsWith("0")) {
            return false;
        } else {
            return str.matches("\\d+(\\.\\d+)?");
        }
    }
}