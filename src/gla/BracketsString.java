/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 17-01-2022
Time: 13:19
File: BracketsString.java */
package gla;

import java.util.Stack;

public class BracketsString {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                else {
                    char top = stack.peek();
                    if ((c == ')' && top == '(') ||
                            (c == '}' && top == '{') ||
                            (c == ']' && top == ']')) {
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BracketsString bst = new BracketsString();
        System.out.println(bst.isValid("{()"));
    }
}