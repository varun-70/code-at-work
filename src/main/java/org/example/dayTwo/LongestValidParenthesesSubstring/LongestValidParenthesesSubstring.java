package org.example.dayTwo.LongestValidParenthesesSubstring;

import java.util.Stack;

public class LongestValidParenthesesSubstring {
    public static void main(String[] args) {
        String input = ")()())";

        int output = getLongestValidParentheses(input.toCharArray());
        System.out.println(output);
    }

    static int getLongestValidParentheses(char[] input) {
        boolean canStart;
        int validNumber = 0;
        int tempNumber = 0;
        int invalidNumber;
        int lastInvalidNumber = 0;
        Stack stack = new Stack();

        for(char s : input) {
            canStart = !(stack.isEmpty() && s == ')');

            if(canStart) {
                if(s == '(') {
                    stack.push(s);
                } else if(s == ')') {
                    stack.pop();
                    tempNumber = tempNumber + 2;

                    invalidNumber = (!stack.isEmpty()) ? stack.size() : 0;
                    if(tempNumber > validNumber && (stack.isEmpty() || lastInvalidNumber != invalidNumber)) {
                        validNumber = tempNumber;
                        tempNumber = 0;
                    }

                    if(lastInvalidNumber != invalidNumber) {
                        tempNumber = 2;
                        lastInvalidNumber = invalidNumber;
                    } else {
                        tempNumber = tempNumber + 2;
                    }
                }
            }
        }

        return validNumber;
    }
}
