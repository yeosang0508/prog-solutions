package com.example.level2.p12924;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("15 -> 4")
    void t1(){assertThat(new Solution().solution(15)).isEqualTo(4);}
}
