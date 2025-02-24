package com.example.level2.p87946;

import java.util.Arrays;

public class main {
}

class Solution {
    private static int answer;
    private static boolean[] visit;

    public int solution(int k, int[][] dungeons) {
       int depth = 0;
       visit = new boolean[dungeons.length];

       dfs(depth, k, dungeons);

       return answer;
    }

    private  static  void dfs(int depth, int k, int[][] dungeons){
        for(int i = 0; i < dungeons.length; i++){
            if(!visit[i] && k >= dungeons[i][0]) { // 방문하지 않았고, 최소 피로도 조건 충족
                visit[i] = true; // 방문 처리
                dfs(depth + 1, k - dungeons[i][1], dungeons); // 피로도 감소 & 다음 탐색
                visit[i] = false; // 원상 복구 (백트래킹)
            }
        }

        answer = Math.max(answer,depth);
    }
}