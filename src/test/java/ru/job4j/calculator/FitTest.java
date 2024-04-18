package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short input = 170;
        double expected = 69;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    // Calculating man's weight with height smaller than 100
    @Test
    void testManWeightHeightSmallerThan100() {
        // Arrange
        short input = 99;
        double expected = -1.15;

        // Act
        double output = Fit.manWeight(input);

        // Assert
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}