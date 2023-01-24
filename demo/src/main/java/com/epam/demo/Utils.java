package com.epam.demo;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
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
        if (str == null) {
            return false;
        } else {
            return str.matches("\\d+(\\.\\d+)?");
        }
    }
}