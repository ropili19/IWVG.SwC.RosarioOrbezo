package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(2, 5);
    }

    @Test
    void testDecimal() {
        assertEquals(0.4, this.fraction.decimal());
    }

    @Test
    void testNumerator() {
        assertEquals(2, this.fraction.getNumerator());
    }

    @Test
    void testDenominator() {
        assertEquals(5, this.fraction.getDenominator());
    }

    @Test
    void testIsEquivalente() {
        Fraction newFraction = new Fraction(2, 5);
        assertTrue(this.fraction.isEquivalente(newFraction));
    }

    @Test
    void testIsPropia() {
        assertTrue(this.fraction.isPropia());
    }

    @Test
    void testInversaFraction(){
        Fraction newFraction = new Fraction(5, 2);
        Assertions.assertEquals(newFraction.getNumerator(), fraction.inversaFraction().getNumerator());
        Assertions.assertEquals(newFraction.getDenominator(), fraction.inversaFraction().getDenominator());
    }
}
