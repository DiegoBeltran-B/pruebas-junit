package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void inicializar() {
        calculadora = new Calculadora();
        System.out.println("@BeforeEach: se creó una nueva Calculadora");
    }

    @Test
    void testSumar() {
        assertEquals(8, calculadora.sumar(5, 3));
    }

    @Test
    void testRestar() {
        assertEquals(2, calculadora.restar(5, 3));
    }

    @Test
    void testMultiplicar() {
        assertEquals(15, calculadora.multiplicar(5, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2.5, calculadora.dividir(5, 2));
    }
}