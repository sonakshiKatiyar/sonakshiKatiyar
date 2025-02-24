package org.com.sonakshi.string;

import java.util.Arrays;

public class NumberOfSeniorCitizens {

    public static void main(String[] args) {
        System.out.println(new NumberOfSeniorCitizens().countSeniors(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"}));
    }

    public int countSeniors(String[] details) {
        return (int) Arrays.stream(details)
                .map(p -> p.charAt(11) +String.valueOf(p.charAt(12)))
                .map(Integer::valueOf)
                .filter(a -> a>60)
                .count();
    }
}
