package com.example.level2.p12945;

public class main {
    public static void main(String[] args) {
        System.out.println(5 % 1234567);
    }
}

class Solution {
    public int solution(int n) {
        int[] answer = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if(i == 0){
                answer[i] = 0;
            }else if(i == 1){
                answer[i] = 1;
            }else {
                int sum = answer[i - 1] + answer[i -2];
                answer[i] = sum % 1234567;
            }
        }

        return answer[n];
    }
}