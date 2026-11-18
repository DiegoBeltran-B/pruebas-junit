package com.example.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ReporteTest {

    private static int pruebasEjecutadas = 0;

    @BeforeAll
    static void prepararReporte() {
        System.out.println("@BeforeAll: INICIO - preparando el reporte de resultados");
    }

    @Test
    void testResultadoVentas() {
        pruebasEjecutadas++;
        assertTrue(pruebasEjecutadas > 0);
        System.out.println("Prueba 1: resultados de ventas registrados");
    }

    @Test
    void testResultadoInventario() {
        pruebasEjecutadas++;
        assertTrue(pruebasEjecutadas > 0);
        System.out.println("Prueba 2: resultados de inventario registrados");
    }

    @Test
    void testResultadoClientes() {
        pruebasEjecutadas++;
        assertTrue(pruebasEjecutadas > 0);
        System.out.println("Prueba 3: resultados de clientes registrados");
    }

    @AfterAll
    static void generarReporteFinal() {
        System.out.println("@AfterAll: FIN - reporte final generado con "
                + pruebasEjecutadas + " pruebas ejecutadas");
    }
}