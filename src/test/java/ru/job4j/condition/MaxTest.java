package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3Then3() {
        int left = 1;
        int right = 2;
        int center = 3;
        int result = Max.max(left, right, center);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5To5Then5() {
        int left = 5;
        int right = 5;
        int center = 5;
        int result = Max.max(left, right, center);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To20To15To25Then25() {
        int left = 6;
        int right = 2;
        int center = 3;
        int fourth = 9;
        int result = Max.max(left, right, center, fourth);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}