package com.example.stack_queue.p42586;

import java.util.ArrayList;
import java.util.List;

public class main {

}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> days = new ArrayList<>();

        // 각 작업이 완료되기까지 걸리는 날짜 계산
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int day = (int) Math.ceil((double) remain / speeds[i]);
            days.add(day);
        }

        List<Integer> result = new ArrayList<>();
        int maxDay = days.get(0); // 첫 번째 작업이 기준
        int count = 1;

        for (int i = 1; i < days.size(); i++) {
            if (days.get(i) <= maxDay) {
                count++; // 같은 배포일에 포함
            } else {
                result.add(count);
                maxDay = days.get(i); // 새로운 기준 업데이트
                count = 1;
            }
        }

        result.add(count); // 마지막 배포 그룹 추가
        return result.stream().mapToInt(i -> i).toArray();
    }
}

