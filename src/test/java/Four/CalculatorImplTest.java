package Four;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorImplTest {

        Calculator calcInt = new CalculatorIntegerImpl(6, 2);
        Calculator calcFloat = new CalculatorFloatImpl(9F, 3F);


    @Test
    void sumIntegerTest() {
        String expected = "8";
        String actually = calcInt.sum();
        Assertions.assertEquals(expected,actually);
    }

    @Test
    void subIntegerTest() {
        String expected = "4";
        String actually = calcInt.sub();
        Assertions.assertEquals(expected,actually);
    }

    @Test
    void multIntegerTest() {
        String expected = "12";
        String actually = calcInt.mult();
        Assertions.assertEquals(expected,actually);
    }

    @Test
    void divIntegerTest() throws CustomNullException {
        String expected = "3";
        String actually = calcInt.div();
        Assertions.assertEquals(expected,actually);
    }
    @Test
    void sumFloatTest() {
        String expected = "12.0";
        String actually = calcFloat.sum();
        Assertions.assertEquals(expected,actually);
    }

    @Test
    void subFloatTest() {
        String expected = "6.0";
        String actually = calcFloat.sub();
        Assertions.assertEquals(expected,actually);
    }

    @Test
    void multFloatTest() {
        String expected = "27.0";
        String actually = calcFloat.mult();
        Assertions.assertEquals(expected,actually);
    }

    @Test
    void divFloatTest() throws CustomNullException {
        String expected = "3.0";
        String actually = calcFloat.div();
        Assertions.assertEquals(expected,actually);
    }
}