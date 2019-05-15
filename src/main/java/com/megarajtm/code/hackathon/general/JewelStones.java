package com.megarajtm.code.hackathon.general;

import java.util.Arrays;

public class JewelStones {
    static public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (char c : J.toCharArray()) {
            if (S.contains(String.valueOf(c))) {
                count += S.chars().filter(ch -> ch == c).count();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("ebd", "bbb"));
    }
}
