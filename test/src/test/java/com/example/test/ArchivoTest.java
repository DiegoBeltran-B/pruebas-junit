package com.example.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTest {

    private boolean archivoAbierto;

    @BeforeEach
    void abrirArchivo() {
        archivoAbierto = true;
        System.out.println("@BeforeEach: archivo ABIERTO");
    }

    @Test
    void testLeerInformacionUsuarios() {
        assertTrue(archivoAbierto);
        System.out.println("Leyendo información de usuarios.txt");
    }

    @Test
    void testLeerInformacionProductos() {
        assertTrue(archivoAbierto);
        System.out.println("Leyendo información de productos.txt");
    }

    @AfterEach
    void cerrarArchivo() {
        archivoAbierto = false;
        System.out.println("@AfterEach: archivo CERRADO");
    }
}