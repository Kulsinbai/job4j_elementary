package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(distance, withPrecision(0.01));
    }

    @Test
    void when70to30then4() {
        Point a = new Point(7, 0);
        Point b = new Point(3, 0);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(4.0, withPrecision(0.01));
    }

    @Test
        void whenMinus10to70then8() {
        Point a = new Point(-1, 0);
        Point b = new Point(7, 0);
        double distance = a.distance(b);
            assertThat(distance).isEqualTo(8.0, withPrecision(0.01));
    }
}