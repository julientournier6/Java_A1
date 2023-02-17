package com.isep.seance2;

public class exo1 {
    static boolean isBinaryArraySum(int[] T, int val) {
        int n = T.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int subarraySum = 0;
            for (int j = i; j < n; j++) {
                subarraySum += T[j];
                if (val == subarraySum) {
                    count++;
                }
            }
        }
        return count >= 1;
    }

    public static void main(String[] args) {
        int val = 7;
        int[] T = {1, 4, 5};

        boolean resultatSomme = isBinaryArraySum(T, val);
        System.out.printf("%d est la somme de deux entiers dans le tableau : %b%n", val, resultatSomme);
    }

}
