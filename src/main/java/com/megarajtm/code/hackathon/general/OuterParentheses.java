package com.megarajtm.code.hackathon.general;

public class OuterParentheses {

    public static String removeOuterParentheses(String S) {
        int openParenthesesCount = 0;
        StringBuilder newStr = new StringBuilder();
        for (char ch : S.toCharArray()) {
            if (ch == '(') {
                if (openParenthesesCount > 0) {
                    newStr.append(ch);
                }
                openParenthesesCount++;
            } else {
                openParenthesesCount--;
                if (openParenthesesCount > 0) {
                    newStr.append(ch);
                }
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("()()"));
    }
}
