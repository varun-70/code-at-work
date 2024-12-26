package org.example.dayTwo.LongestValidParenthesesSubstring;

import java.util.Stack;

/**
 * To find the longest parentheses substring
 */
public class LongestValidParenthesesSubstring {
    public static void main(String[] args) {
        String input = ")()())";

        int output = getLongestValidParentheses(input.toCharArray());
        System.out.println(output);
    }

    /**
     * getLongestValidParentheses method calculates the length of the longest valid parentheses in a given character array.
     * A valid substring is defined as one where every opening parenthesis has a corresponding closing
     * parenthesis in the correct order.
     *
     * @param input in character array
     * @return calculate length in int
     */
    static int getLongestValidParentheses(char[] input) {
        boolean canStart;
        int validNumber = 0;
        int tempNumber = 0;
        int invalidNumber;
        int lastInvalidNumber = 0;
        Stack stack = new Stack();

        // Loops over the input character array and calculate length
        for(char s : input) {
            // If stack is empty and starts with closing parenthesis ')', then set to false else true
            canStart = !(stack.isEmpty() && s == ')');

            // Will enter the condition if char is a valid condition
            if(canStart) {
                if(s == '(') {
                    stack.push(s);
                } else if(s == ')') {
                    stack.pop();
                    // tempNumber variable holds current value before assigning it to validNumber
                    tempNumber = tempNumber + 2;

                    // Set current stack size if the stack is not empty; otherwise, set 0
                    invalidNumber = (!stack.isEmpty()) ? stack.size() : 0;

                    // Assigns tempNumber to validNumber.
                    // Updates validNumber if tempNumber is greater and the stack is empty or contains invalid parentheses.
                    if(tempNumber > validNumber && (stack.isEmpty() || lastInvalidNumber != invalidNumber)) {
                        validNumber = tempNumber;
                        tempNumber = 0;
                    }

                    // Check if the current invalid number differs from the last tracked invalid number.
                    // If they differ, reset tempNumber to 2 and update lastInvalidNumber to the current invalidNumber.
                    // Otherwise, increment tempNumber by 2 to account for a valid pair of parentheses.
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
