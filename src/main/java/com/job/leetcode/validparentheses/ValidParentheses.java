package com.job.leetcode.validparentheses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ValidParentheses {

    public boolean isValid(String s) {
        HashMap<Character, String> forwardMap = new HashMap<>();
        forwardMap.put('(', "parentheses");
        forwardMap.put('[', "squareBrackets");
        forwardMap.put('{', "braces");
        HashMap<Character, String> backwardMap = new HashMap<>();
        backwardMap.put(')', "parentheses");
        backwardMap.put(']', "squareBrackets");
        backwardMap.put('}', "braces");
        List<Character> forwardList = Arrays.asList('(', '[', '{');
        List<Character> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (Character c : chars) {
            if (forwardList.contains(c)) {
                list.add(c);
            } else {
                if (list.size() == 0) {
                    return false;
                }
                int size = list.size() - 1;
                Character character = list.get(size);
                String sForward = forwardMap.get(character);
                String sBackward = backwardMap.get(c);
                if (sForward.equals(sBackward)) {
                    list.remove(size);
                } else {
                    return false;
                }
            }
        }
        return list.size() == 0;
    }

}
