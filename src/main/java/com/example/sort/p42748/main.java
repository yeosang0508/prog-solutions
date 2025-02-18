package com.example.sort.p42748;

import java.util.Arrays;

public class main {
}


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;

            int count = end - start;
            int[] arr = new int[count];
            for( int j = start; j < end; j++){
                arr[count - 1] = array[j];

                count--;
            }
            Arrays.sort(arr);
            answer[i] = arr[k];
        }

        return answer;
    }
}