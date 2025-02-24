package com.example.level2.p87946;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("80, [[80,20],[50,40],[30,10]] -> 3")
    void t1(){assertThat(new Solution().solution(80, new int[][]{{80,20}, {50,40}, {30, 10}})).isEqualTo(3);}
}
