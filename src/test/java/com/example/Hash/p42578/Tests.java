package com.example.Hash.p42578;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[[\"yellow_hat\", \"headgear\"], [\"blue_sunglasses\", \"eyewear\"], [\"green_turban\", \"headgear\"]] -> 5")
    void t1() {
        assertThat(new Solution().solution(new String[][]{
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        })).isEqualTo(5);
    }

    @Test
    @DisplayName("[[\"crow_mask\", \"face\"], [\"blue_sunglasses\", \"face\"], [\"smoky_makeup\", \"face\"]] -> 3")
    void t2() {
        assertThat(new Solution().solution(new String[][]{
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"}
        })).isEqualTo(3);
    }


}