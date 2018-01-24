package com.bbd;

import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class RomanConverter {

    public static int Convert(String s) {

        int sum = 0;

        if (s == null || s.length() == 0) {
            throw new RuntimeException("Invalid roman number");
        }
        List<Character> characters = s.chars().mapToObj(e->(char)e).collect(Collectors.toList());
        Set<Character> duplicated = characters.stream().filter(n -> characters.stream().filter(x -> x == n).count() > 3).collect(Collectors.toSet());

        if(duplicated.size() > 0)
            throw new RuntimeException("Invalid roman number");
        s = s.toUpperCase();


        s = s.replaceAll("IV", "IIII");
        s = s.replaceAll("IX", "VIIII");
        s = s.replaceAll("XL", "XXXX");
        s = s.replaceAll("XC", "LXXXX");
        s = s.replaceAll("CD", "CCCC");
        s = s.replaceAll("CM", "DCCCC");

        for(int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    sum += 1;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    sum += 10;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    sum+=100;
                    break;
                case 'D':
                    sum+=500;
                    break;
                case 'M':
                    sum+=1000;
                    break;
                default:
                    throw new RuntimeException("Invalid Roman Number");
            }

        }
        return sum;
    }
}
