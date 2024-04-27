package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void swapCell1By4() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 4;
        int destination = 1;
        int[] expected = {1, 5, 3, 4, 2};
        int[] result = SwitchArray.swap(input, source, destination);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void swapCell3By2() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 2;
        int destination = 3;
        int[] expected = {1, 2, 4, 3, 5};
        int[] result = SwitchArray.swap(input, source, destination);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void swapCell4By1() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 1;
        int destination = 4;
        int[] expected = {1, 5, 3, 4, 2};
        int[] result = SwitchArray.swap(input, source, destination);
        assertThat(result).containsExactly(expected);
    }
}