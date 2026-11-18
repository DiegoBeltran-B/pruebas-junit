package com.example.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ConexionBDTest {

    private static boolean conexionActiva = false;

    @BeforeAll
    static void iniciarConexion() {
        conexionActiva = true;
        System.out.println("@BeforeAll: conexión a la base de datos establecida");
    }

    @Test
    void testConsultaUsuarios() {
        assertTrue(conexionActiva, "La conexión debe estar activa");
        System.out.println("Consulta: SELECT * FROM usuarios");
    }

    @Test
    void testConsultaProductos() {
        assertTrue(conexionActiva, "La conexión debe estar activa");
        System.out.println("Consulta: SELECT * FROM productos");
    }

    @Test
    void testConsultaVentas() {
        assertTrue(conexionActiva, "La conexión debe estar activa");
        System.out.println("Consulta: SELECT * FROM ventas");
    }
}