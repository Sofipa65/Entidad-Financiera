/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Sofia
 */
public class CuentaDeAhorros extends Cuenta {

    public CuentaDeAhorros(String nombre, String numero, double saldo) {
        super(nombre, numero, saldo);
    }

    
    @Override
    public String toString() {
        return "CUENTA DE AHORROS: " + "TITULAR: " + nombre + ", NÚMERO: " + numero + ", SALDO: " + saldo + "\n";
    }
    
}
