/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sofia
 */
public class CuentaCorrienteTest {
    
    @Test
    public void testRetirarConSaldoSuficiente() {
        CuentaCorriente cuenta = new CuentaCorriente("Ana", "CC001", 100000);

        cuenta.Retirar(50000);
        assertEquals(50000, cuenta.getSaldo(), 0.01);
    }

    @Test
    public void testRetirarConSobregiro() {
        CuentaCorriente cuenta = new CuentaCorriente("Luis", "CC002", 0);

        cuenta.Retirar(400000); 

        assertEquals(-400000, cuenta.getSaldo(), 0.01);
    }

    @Test
    public void testRetirarConSobregiroExcedido() {
        CuentaCorriente cuenta = new CuentaCorriente("Pedro", "CC003", 0);

        cuenta.Retirar(600000);

        assertEquals(0, cuenta.getSaldo(), 0.01);
    }
    
}
