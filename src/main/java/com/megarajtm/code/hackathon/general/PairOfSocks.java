package com.megarajtm.code.hackathon.general;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class PairOfSocks {

    static int sockMerchant(int n, int[] ar) {
        int count = 0;
        Map<Integer, Long> groupByRes = Arrays.stream(ar)
                .boxed()
                .collect(groupingBy(Function.identity(), counting()));
        for (final Integer integer : groupByRes.keySet()) {
            count += groupByRes.get(integer) / 2;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }
}
