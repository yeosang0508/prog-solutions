package com.example.level2.p70129;


public class main {
}

class Solution {
    public int[] solution(String s) {

        int count = 0; // 이진 변환의 횟수
        int remove = 0; // 제거된 모든 0의 개수

        String result = s; // 이진 변환 결과

        while(!result.equals("1")){
            String[] re = result.split("");
            int length = 0; // 0 제거 후 길이

            for(int i = 0; i < re.length; i++){
                int a = Integer.parseInt(re[i]);
                if (a == 1){
                    result = a + "";
                    length++;
                }else {
                    remove++;
                }
            }

            // 0 제거 후 길이를 이진 변환
            result = Integer.toBinaryString(length);
            count++;
        }

        int[] answer = {count, remove};

        return answer;
    }
}