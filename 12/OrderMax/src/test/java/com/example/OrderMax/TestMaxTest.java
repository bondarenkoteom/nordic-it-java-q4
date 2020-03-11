package com.example.OrderMax;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestMaxTest {

    @Test
    @DisplayName("Проверка последовательности из 0")
    public void testOrderNulls() {
        Integer[] array1 = { 0, 0, 0, 0 };
        var result = new TestMaxApplication().countMaxOrder(array1);
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("Проверка последовательности из 1")
    public void testOrderOnes() {
        Integer[] array1 = { 1, 1, 1, 1 };
        var result = new TestMaxApplication().countMaxOrder(array1);
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("Проверка последовательности при повторении 1 в начале")
    public void testOrderFirstOnes() {
        Integer[] array1 = { 1, 1, 1, 0, 0, 0 };
        var result = new TestMaxApplication().countMaxOrder(array1);
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("Проверка последовательности при повторении 1 в конце")
    public void testOrderFirstNulls() {
        Integer[] array1 = { 0, 0, 0, 1, 1, 1 };
        var result = new TestMaxApplication().countMaxOrder(array1);
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("Проверка последовательности при отсутствии последовательности")
    public void testOrderVoid() {
        Integer[] array1 = {};
        var result = new TestMaxApplication().countMaxOrder(array1);
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("Проверка последовательности при значении NULL")
    public void testOrderNull() {
        Integer[] array1 = null;
        var result = new TestMaxApplication().countMaxOrder(array1);
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("Проверка последовательности при наличии двух последовательностей 1 с разным количеством повторений")
    public void testOrderMix1() {
        Integer[] array1 = { 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1 };
        var result = new TestMaxApplication().countMaxOrder(array1);
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("Проверка последовательности при наличии одного элемента 1 и последовательностей 0")
    public void testOrderMix2() {
        Integer[] array1 = { 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0 };
        var result = new TestMaxApplication().countMaxOrder(array1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("Проверка последовательности при расположении максимальной последовательности 1 в центре основной")
    public void testOrderMix3() {
        Integer[] array1 = { 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1 };
        var result = new TestMaxApplication().countMaxOrder(array1);
        assertThat(result).isEqualTo(5);
    }

    @Test
    @DisplayName("Проверка последовательности при повторении максимальной последовательности 1")
    public void testOrderMix4() {
        Integer[] array1 = { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0 };
        var result = new TestMaxApplication().countMaxOrder(array1);
        assertThat(result).isEqualTo(3);
    }

}
