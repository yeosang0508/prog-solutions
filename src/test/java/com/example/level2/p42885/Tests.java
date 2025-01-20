package com.example.level2.p42885;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[70, 50, 80, 50], 100 -> 3")
    void t1() {
        assertThat(new Solution().solution(new int[]{70, 50, 80, 50}, 100)).isEqualTo(3);
    }

    @Test
    @DisplayName("[70, 80, 50], 100 -> 3")
    void t2() {
        assertThat(new Solution().solution(new int[]{70, 80, 50}, 100)).isEqualTo(3);
    }


}
