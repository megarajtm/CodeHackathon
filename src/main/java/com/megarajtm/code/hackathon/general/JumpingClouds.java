package com.megarajtm.code.hackathon.general;

public class JumpingClouds {
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        for (int i = 0; i < c.length - 1; ) {
            if (i + 2 < c.length && c[i + 2] != 1) {
                i = i + 2;
            } else {
                i++;
            }
            jumps++;
        }
        return jumps;
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
    }
}
