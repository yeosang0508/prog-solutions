package com.example.level2.p42842;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("24, 24 -> 8,6")
    void t1(){assertThat(new Solution().solution(24,24)).isEqualTo(new int[]{8, 6});}

    @Test
    @DisplayName("10, 2 -> 4, 3")
    void t2(){assertThat(new Solution().solution(10,2)).isEqualTo(new int[]{4, 3});}

    @Test
    @DisplayName("8, 1 -> 3,3")
    void t3(){assertThat(new Solution().solution(8,1)).isEqualTo(new int[]{3, 3});}


}
