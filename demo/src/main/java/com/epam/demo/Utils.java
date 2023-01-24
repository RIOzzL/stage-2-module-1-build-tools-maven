package com.epam.demo;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        Integer integer = args.stream().map(Integer::parseInt)
                .filter(num -> num < 0)
                .findFirst().orElse(null);
        return integer == null;
        //magic happens here
    }
}