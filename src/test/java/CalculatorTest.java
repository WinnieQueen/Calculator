import Models.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(15, Calculator.add(13, 2));
        assertEquals(5.3, Calculator.add(3.1, 2.2));
        assertEquals(-5, Calculator.add(-3, -2));
    }

    @Test
    void subtract() {
        assertEquals(1, Calculator.subtract(3, 2));
        assertEquals(1.1, Calculator.subtract(3.2, 2.1));
        assertEquals(-1, Calculator.subtract(-3, -2));
    }

    @Test
    void multiply() {
        assertEquals(6, Calculator.multiply(3, 2));
        assertEquals(6.72, Calculator.multiply(3.2, 2.1));
        assertEquals(6, Calculator.multiply(-3, -2));
        assertEquals(-6, Calculator.multiply(-3, 2));
    }

    @Test
    void divide() {
        assertEquals(2, Calculator.divide(6, 3));
        assertEquals(1.52, Calculator.divide(3.2, 2.1));
        assertEquals(1, Calculator.divide(-3, -3));
        assertEquals(-1, Calculator.divide(-3, 3));
    }
}