package com.example.level2.p12973;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("baabaa -> 1")
    void t1(){assertThat(new Solution().solution("baabaa")).isEqualTo(1);}

    @Test
    @DisplayName("cdcd -> 0")
    void t2(){assertThat(new Solution().solution("cdcd")).isEqualTo(0);}
}
