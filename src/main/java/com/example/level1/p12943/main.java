package com.example.level1.p12943;

public class main {
}
class Solution {
    public int solution(long num) {
        int count = 0;

        if(num == 1) return 0;

        while (num != 1){
            if(num % 2 == 0) {
                num = num / 2;
            }else if (num % 2 == 1){
                num = num * 3 + 1;
            }

            count++;

            if(count >= 500) {
                count = -1;
                break;
            }

        }
        return count;
    }
}