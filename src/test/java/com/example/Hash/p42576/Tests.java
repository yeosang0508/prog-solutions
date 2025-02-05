package com.example.Hash.p42576;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[\"leo\", \"kiki\", \"eden\"], [\"eden\", \"kiki\"] -> leo")
    void t1() {
        assertThat(new Solution().solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"})).isEqualTo("leo");
    }

    @Test
    @DisplayName("[\"marina\", \"josipa\", \"nikola\", \"vinko\", \"filipa\"], [\"josipa\", \"filipa\", \"marina\", \"nikola\"] -> vinko")
    void t2() {
        assertThat(new Solution().solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"})).isEqualTo("vinko");
    }

    @Test
    @DisplayName("[\"mislav\", \"stanko\", \"mislav\", \"ana\"], [\"stanko\", \"ana\", \"mislav\"] -> mislav")
    void t3() {
        assertThat(new Solution().solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"})).isEqualTo("mislav");
    }


}
