package com.megarajtm.code.hackathon.general;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        long count = s.chars().filter(ch -> ch == 'a').count();
        int l = (int) (n % s.length());
        count *= n / s.length();
        count += s.substring(0, l).chars().filter(ch -> ch == 'a').count();
        return count;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("a", 1000000000000L));
    }
}
