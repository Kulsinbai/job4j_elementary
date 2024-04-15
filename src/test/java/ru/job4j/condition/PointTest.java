package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when70to30then4() {
        double expected = 4;
        int x1 = 7;
        int y1 = 0;
        int x2 = 3;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
        void whenMinus10to70then8() {
            double expected = 8;
            int x1 = -1;
            int y1 = 0;
            int x2 = 7;
            int y2 = 0;
            double output = Point.distance(x1, y1, x2, y2);
            assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}