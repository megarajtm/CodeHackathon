package com.megarajtm.code.hackathon.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PmNumbers {

    static void getPrimes(final int start, final int end) {
        final List<Integer> primes = new ArrayList<>();
        final boolean[] nums = new boolean[end+1];
        Arrays.fill(nums, true);
        for (int p = 2; p * p <= end; p++) {
            if (nums[p]) {
                for (int i = 2 * p; i <= end; i = i + p) {
                    nums[i] = false;
                }
            }
        }
        if (start < 3) {
            primes.add(2);
        }
        for (int i = start; i <= end; i++) {
            if (nums[i] && nums[sumDig(i)]) {
                System.out.print(i + " ");
                primes.add(i);
            }
        }
    }

    static int sumDig(int n) {
        int sum;
        for (sum = 0; n > 0; sum += n % 10, n /= 10) ;
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int start = s.nextInt();
        final int end = s.nextInt();
        getPrimes(start,end);
    }

}
