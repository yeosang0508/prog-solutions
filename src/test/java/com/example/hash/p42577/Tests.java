package com.example.hash.p42577;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {


    @Test
    @DisplayName("[\"119\", \"97674223\", \"1195524421\"] ->  false")
    void t1(){assertThat(new Solution().solution(new String[]{"119", "97674223", "1195524421"})).isEqualTo(false);}

    @Test
    @DisplayName("[\"123\",\"456\",\"789\"] ->  true")
    void t2(){assertThat(new Solution().solution(new String[]{"123","456","789"})).isEqualTo(true);}

    @Test
    @DisplayName("[\"12\",\"123\",\"1235\",\"567\",\"88\"] ->  false")
    void t3(){assertThat(new Solution().solution(new String[]{"12","123","1235","567","88"})).isEqualTo(false);}



}
