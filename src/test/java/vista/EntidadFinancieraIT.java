/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package vista;

import modelo.Cuenta;
import modelo.CuentaCorriente;
import modelo.CuentaDeAhorros;
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
public class EntidadFinancieraIT {
    
    @Test
    public void testCrearCuentaDeAhorrosConSaldo() {
        EntidadFinanciera.crearCuenta("Carlos", 200000, 1);

        assertEquals(1, EntidadFinanciera.cuentas.size());
        Cuenta cuenta = EntidadFinanciera.cuentas.get(0);

        assertEquals("Carlos", cuenta.getNombre());
        assertEquals(200000.0, cuenta.getSaldo(), 0.01);
    }

    @Test
    public void testCrearCuentaCorrienteSinSaldo() {
        EntidadFinanciera.crearCuenta("María", 2);

        assertEquals(1, EntidadFinanciera.cuentas.size());
        Cuenta cuenta = EntidadFinanciera.cuentas.get(0);

        assertTrue(cuenta instanceof CuentaCorriente);
        assertEquals("María", cuenta.getNombre());
        assertEquals(0.0, cuenta.getSaldo(), 0.01);
    }

    @Test
    public void testReembolsar() {
        EntidadFinanciera.crearCuenta("Ana", 100000, 1);
        Cuenta cuenta = EntidadFinanciera.cuentas.get(0);

        double saldoAntes = cuenta.getSaldo();
        cuenta.SumarSaldo(50000);

        assertEquals(saldoAntes + 50000, cuenta.getSaldo(), 0.01);
    }

    @Test
    public void testConsignar() {
        EntidadFinanciera.crearCuenta("Juan", 0, 1);
        Cuenta cuenta = EntidadFinanciera.cuentas.get(0);

        cuenta.SumarSaldo(30000);
        assertEquals(30000, cuenta.getSaldo(), 0.01);
    }

    @Test
    public void testRetirarDesdeCuentaCorrienteConSobregiroPermitido() {
        EntidadFinanciera.crearCuenta("Laura", 0, 2);
        CuentaCorriente cuenta = (CuentaCorriente) EntidadFinanciera.cuentas.get(0);

        cuenta.Retirar(400000);
        assertEquals(-400000, cuenta.getSaldo(), 0.01);
    }

    @Test
    public void testRetirarDesdeCuentaCorrienteExcedeSobregiro() {
        EntidadFinanciera.crearCuenta("Pedro", 0, 2);
        CuentaCorriente cuenta = (CuentaCorriente) EntidadFinanciera.cuentas.get(0);

        cuenta.Retirar(600000);
        assertEquals(0, cuenta.getSaldo(), 0.01);
    }
}
