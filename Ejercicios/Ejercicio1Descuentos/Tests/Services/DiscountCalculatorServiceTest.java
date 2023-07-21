package Services;

import Entities.DiscountCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorServiceTest {

    DiscountCalculatorService dcs;

    @BeforeEach
    public void setUp() {

        dcs = new DiscountCalculatorService();

    }

    @Test
    public void calcularDescuentoTest(){

        System.out.println("Expected value: 77");
        System.out.println("Actual value: " + dcs.calcularDescuento(new DiscountCalculator(70)));
        assertEquals(77, dcs.calcularDescuento(new DiscountCalculator(70)));

    }

}