package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(2, 3);
    }

    @Test
    void testNumerator(){
        assertEquals(2,fraction.getNumerator());
    }

    @Test
    void testDenominator(){
        assertEquals(3,fraction.getDenominator());
    }
    @Test
    void testDecimal(){
        assertEquals(0.6666666666666666,fraction.decimal());
    }
}
