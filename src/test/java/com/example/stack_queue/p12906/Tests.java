package com.example.stack_queue.p12906;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[1,1,3,3,0,1,1] -> [1,3,0,1]")
    void t1(){assertThat(new Solution().solution(new int[]{1,1,3,3,0,1,1})).isEqualTo(new int[]{1,3,0,1});}

    @Test
    @DisplayName("[4,4,4,3,3] -> [4,3]")
    void t2(){assertThat(new Solution().solution(new int[]{4,4,4,3,3})).isEqualTo(new int[]{4,3});}


}
