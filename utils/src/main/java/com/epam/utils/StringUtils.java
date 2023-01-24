package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.startsWith("0")) {
            return false;
        } else {
            return str.matches("\\d+(\\.\\d+)?");
        }
    }
}
