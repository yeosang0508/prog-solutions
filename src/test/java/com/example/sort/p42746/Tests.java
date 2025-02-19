package com.example.sort.p42746;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[6, 10, 2] -> 6210")
    void t1(){assertThat(new Solution().solution(new int[]{6, 10, 2})).isEqualTo("6210");}

    @Test
    @DisplayName("[3, 30, 34, 5, 9] -> 9534330")
    void t2(){assertThat(new Solution().solution(new int[]{3, 30, 34, 5, 9})).isEqualTo("9534330");}



}
