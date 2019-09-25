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
    void testNumerator() {
        assertEquals(2, fraction.getNumerator());
    }

    @Test
    void testDenominator() {
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.6666666666666666, fraction.decimal());
    }

    @Test
    void testSumInteger() {
        assertEquals(2.6666666666666665, fraction.sumInteger(2));
    }

    @Test
    void testSubtractInteger() {
        assertEquals(-1.3333333333333333, fraction.subtractInteger(2));
    }

    @Test
    void testIsEquals() {
        Fraction fraction2 = new Fraction(7, 3);
        assertEquals(false, fraction.isEqual(fraction, fraction2));
    }

}
