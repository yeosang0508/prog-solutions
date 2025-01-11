package com.example.level2.p12939;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("테스트1")
    void t1() {
        assertThat(new Solution().solution("1 2 3 4")).isEqualTo("1 4");
    }

    @Test
    @DisplayName("테스트2")
    void t2() {
        assertThat(new Solution().solution("-1 -2 -3 -4")).isEqualTo("-4 -1");
    }

    @Test
    @DisplayName("테스트3")
    void t3() {
        assertThat(new Solution().solution("-1 -1")).isEqualTo("-1 -1");
    }


}
