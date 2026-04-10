/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.dam.practicajunit;

import org.junit.Test;
import static org.junit.Assert.*;

public class CirculoTest {

    @Test
    public void testConstructorVacio() {
        Circulo c = new Circulo();
        assertEquals(0, c.getRadio(), 0);
    }

   @Test
    public void testGetRadio() {
        Circulo c = new Circulo(5.0);
        assertEquals(5.0, c.getRadio(), 0.0);
    }

    @Test
    public void testSetRadio() {
    Circulo c = new Circulo();
    c.setRadio(10.0);
    assertEquals(10.0, c.getRadio(), 0.0);
}

    @Test
    public void testCalcularArea() {
    Circulo c = new Circulo(1.0);

    assertEquals(5.0, c.calcularArea(), 0.0);
}

    @Test
    public void testCalcularPerimetro() {
    Circulo c = new Circulo(2.0);
    
    assertEquals(12.56, c.calcularPerimetro(), 0.01);
}

   @Test
    public void testMostrarRadio() {
        Circulo c = new Circulo(4.0);
        assertEquals(4.0, c.getRadio(), 0.0);
    }

    @Test
    public void testMostrarNombre() {
        Circulo c = new Circulo();
        c.mostrarNombre();
    }

}