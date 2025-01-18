package com.example.level2.p42842;

public class main {

}

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int carpet = brown + yellow;

        for (int i = 3; i <= carpet; i++) {
            int col = i; // 세로
            int row = carpet / col; // 가로

            if (row >= col) {
                if ((row - 2) * (col - 2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }
            }

        }
        return answer;
    }

}