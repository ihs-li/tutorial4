package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Calc {
    // 假设这里有加法和减法方法，这里先简单定义一个加法方法示例
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
}

class CalcTest {
    Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2, 2));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, c.subtract(4, 2));
    }
}
