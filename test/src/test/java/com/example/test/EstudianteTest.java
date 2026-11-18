package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstudianteTest {

    private Estudiante estudiante;

    @BeforeAll
    static void inicializarRecursosGenerales() {
        System.out.println("@BeforeAll: recursos generales inicializados");
    }

    @BeforeEach
    void crearEstudiante() {
        estudiante = new Estudiante("1020304050", "Juan Pérez", 20);
        System.out.println("@BeforeEach: estudiante creado");
    }

    @Test
    void testRegistroCorrecto() {
        assertNotNull(estudiante);
        assertEquals("1020304050", estudiante.getIdentificacion());
        assertEquals("Juan Pérez", estudiante.getNombre());
        assertEquals(20, estudiante.getEdad());
        System.out.println("Prueba: registro correcto");
    }

    @Test
    void testValidacionEdad() {
        assertTrue(estudiante.esEdadValida());
        System.out.println("Prueba: edad válida");
    }

    @Test
    void testValidacionNombre() {
        assertTrue(estudiante.esNombreValido());
        System.out.println("Prueba: nombre válido");
    }

    @AfterEach
    void limpiarDatos() {
        estudiante = null;
        System.out.println("@AfterEach: datos del estudiante limpiados");
    }

    @AfterAll
    static void finalizarRecursosGenerales() {
        System.out.println("@AfterAll: recursos generales finalizados");
    }
}