package com.example.hash.p42578;

import java.util.HashMap;
import java.util.Map;

public class main {
}

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> type = new HashMap<>();

        // 의상 종류별 개수 카운트
        for (String[] cloth : clothes) {
            type.put(cloth[1], type.getOrDefault(cloth[1], 0) + 1);
        }

        int answer = 1;

        // (각 종류별 개수 + 1) 곱하기
        for (int count : type.values()) {
            answer *= (count + 1);
        }

        // 모든 의상을 입지 않는 경우(1) 제외
        return answer - 1;
    }
}