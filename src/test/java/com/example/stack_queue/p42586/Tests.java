package com.example.stack_queue.p42586;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[93, 30, 55], [1, 30, 5] -> [2, 1]")
    void t1(){assertThat(new Solution().solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})).isEqualTo(new int[]{2, 1});}

    @Test
    @DisplayName("[95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1, 1] -> [1, 3, 2]")
    void t2(){assertThat(new Solution().solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})).isEqualTo(new int[]{1, 3, 2});}



}
