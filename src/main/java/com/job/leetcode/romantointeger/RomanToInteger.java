package com.job.leetcode.romantointeger;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> characterIntegerMap = new HashMap<>();
        characterIntegerMap.put('I', 1);
        characterIntegerMap.put('V', 5);
        characterIntegerMap.put('X', 10);
        characterIntegerMap.put('L', 50);
        characterIntegerMap.put('C', 100);
        characterIntegerMap.put('D', 500);
        characterIntegerMap.put('M', 1000);
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            if (hasBigger(characterIntegerMap, chars, i)) {
                result = result - characterIntegerMap.get(chars[i]);
            } else {
                result = result + characterIntegerMap.get(chars[i]);
            }
        }
        return result;
    }

    private boolean hasBigger(HashMap<Character, Integer> map, char[] chars, int index) {
        boolean isBigger = false;
        int value = map.get(chars[index]);
        for (; index < chars.length; index++) {
            if (map.get(chars[index]) > value) {
                isBigger = true;
                break;
            }
        }
        return isBigger;
    }
}
