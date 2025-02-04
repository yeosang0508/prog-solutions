package com.example.Hash.p1845;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[3,1,2,3] -> 2")
    void t1(){assertThat(new Solution().solution(new int[]{3, 1, 2, 3})).isEqualTo(2);}

    @Test
    @DisplayName("[3,3,3,2,2,4] -> 3")
    void t2(){assertThat(new Solution().solution(new int[]{3,3,3,2,2,4})).isEqualTo(3);}

    @Test
    @DisplayName("[3,3,3,2,2,2] -> 2")
    void t3(){assertThat(new Solution().solution(new int[]{3,3,3,2,2,2})).isEqualTo(2);}



}
