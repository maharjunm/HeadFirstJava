package com.tw.amzn;


import java.util.ArrayList;
import java.util.List;

public class Paranthesis {
    public static void main(String[] args) {
        String paranthesis = "{{[][]()}()}{{}}{}{}{[]}";
        Paranthesis paranthesis1 = new Paranthesis();
        System.out.println(paranthesis1.isValidParenthesis(paranthesis));
    }

    public boolean isValidParenthesis(String paranthesis) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < paranthesis.length(); i++) {
            char currentCharacter = paranthesis.charAt(i);
            if (currentCharacter == '{' || currentCharacter == '[' || currentCharacter == '(') {
                list.add(currentCharacter);
            } else {
                int lastOpenBracesIndex = list.size() - 1;
                if(currentCharacter == '}' && list.get(lastOpenBracesIndex) != '{') {
                    return false;
                }
                else if(currentCharacter == ']' && list.get(lastOpenBracesIndex) != '[') {
                    return false;
                }
                else if(currentCharacter == ')' && list.get(lastOpenBracesIndex) != '(') {
                    return false;
                } else {
                    list.remove(lastOpenBracesIndex);
                }
            }
        }
        if(list.size() == 0)
            return true;
        return false;
    }
}
