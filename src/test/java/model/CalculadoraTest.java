package com.calculadora.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void setUp() {

        calculadora = new Calculadora();
    }

    @Test
    public void testSumar() {

        double resultado =
                calculadora.sumar(10, 5);

        assertEquals(
                15,
                resultado,
                0.001
        );
    }

    @Test
    public void testRestar() {

        double resultado =
                calculadora.restar(10, 5);

        assertEquals(
                5,
                resultado,
                0.001
        );
    }

    @Test
    public void testMultiplicar() {

        double resultado =
                calculadora.multiplicar(10, 5);

        assertEquals(
                50,
                resultado,
                0.001
        );
    }

    @Test
    public void testDividir() {

        double resultado =
                calculadora.dividir(10, 5);

        assertEquals(
                2,
                resultado,
                0.001
        );
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirEntreCero() {

        calculadora.dividir(10, 0);
    }
}
