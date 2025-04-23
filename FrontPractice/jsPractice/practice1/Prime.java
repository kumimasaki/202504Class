package jsPractice.practice1;

import java.util.Arrays;

public class Prime {
    private static final int CALC_NUM = 100;

    private static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] primes = new int[CALC_NUM];
        int k = 0;
        for (int i = 2; k < CALC_NUM; i++) {
            if (isPrime(i)) {
                primes[k++] = i;
            }
        }
        System.out.println(Arrays.toString(primes));
    }
}
