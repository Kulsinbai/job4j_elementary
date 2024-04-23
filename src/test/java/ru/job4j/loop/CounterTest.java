package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart4Finish9Then39() {
        int start = 4;
        int finish = 9;
        int expected = 39;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart7Finish3Then0() {
        int start = 7;
        int finish = 3;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart2Finish14Then56() {
        int start = 2;
        int finish = 14;
        int result = Counter.sumByEven(start, finish);
        int expected = 56;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus3Finish11Then28() {
        int start = -3;
        int finish = 11;
        int result = Counter.sumByEven(start, finish);
        int expected = 28;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart6Finish16Then66() {
        int start = 6;
        int finish = 16;
        int result = Counter.sumByEven(start, finish);
        int expected = 66;
        assertThat(result).isEqualTo(expected);
    }
}