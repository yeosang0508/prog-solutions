package com.example.level2.p12939;

public class main {

}

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] strs = s.split(" ");

        int[] arr = new int[strs.length];


        for (int i = 0; i < strs.length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        int min = arr[0];
        int max = arr[0];

        for (int k = 0; k < arr.length; k++) {

            if (min > arr[k]) {
                min = arr[k];
            }

            if (max < arr[k]) {
                max = arr[k];
            }
        }

        answer = min + " " + max;

        return answer;
    }
}