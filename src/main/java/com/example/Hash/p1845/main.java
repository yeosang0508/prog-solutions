package com.example.Hash.p1845;

import java.util.HashSet;

public class main {
}

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int get = nums.length / 2 ;

        if(set.size() > get){
           answer = get;
        }else {
            answer = set.size();
        }

        return answer;
    }
}