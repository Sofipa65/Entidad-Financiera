/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import java.time.LocalDate;
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
public class CuentaTest {
    
    @Test
    public void testSumarSaldo() {
        Cuenta cuenta = new Cuenta("Juan", "002", 1000);
        cuenta.SumarSaldo(500);
        assertEquals(1500, cuenta.getSaldo(), 0.01);
    }

    @Test
    public void testRetirarSaldo() {
        Cuenta cuenta = new Cuenta("Ana", "003", 2000);
        cuenta.Retirar(300);
        assertEquals(1700.0, cuenta.getSaldo(), 0.01);
    }

}
