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
public class CuentaDeAhorrosTest {
    
   @Test
    public void testRetirarConSaldoSuficiente() {
        CuentaDeAhorros cuenta = new CuentaDeAhorros("Ana", "CC001", 100000);

        cuenta.Retirar(50000);
        assertEquals(50000, cuenta.getSaldo(), 0.01);
    }

    @Test
    public void testRetirarConSaldoinsuficiente() {
        CuentaDeAhorros cuenta = new CuentaDeAhorros("Pedro", "CC003", 0);

        cuenta.Retirar(600000);

        assertEquals(0, cuenta.getSaldo(), 0.01);
    }
}
