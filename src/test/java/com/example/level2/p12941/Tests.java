package com.example.level2.p12941;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[1, 4, 2] -> [5, 4, 4]")
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 4, 2}, new int[]{5,4,4})).isEqualTo(29);
    }

    @Test
    @DisplayName("[1, 2] -> [3, 4]")
    void t2() {
        assertThat(new Solution().solution(new int[]{1, 2}, new int[]{3, 4})).isEqualTo(10);
    }



}
