package com.megarajtm.code.hackathon.general;

public class CountingValleys {
    static int countingValleys(int n, String s) {
        int count = 0;
        int elivation = 0;
        boolean downhill = false;
        for (char ch : s.toCharArray()) {
            if (elivation == 0) {
                downhill = ch == 'D';
            }
            if (ch == 'D') {
                elivation--;
            } else {
                elivation++;
            }
            if (elivation == 0 && downhill) {
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDUUDDU"));
    }
}
