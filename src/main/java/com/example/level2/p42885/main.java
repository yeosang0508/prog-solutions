package com.example.level2.p42885;

import java.util.Arrays;

public class main {
}

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int a = 0;
        int b = people.length - 1;

        while(a < b){
            int sum = people[a] + people[b];


            if(limit >= sum){
                answer++;
                b--;
                a++;
            }else{
                b--;
            }
        }
        return people.length - answer;
    }
}