/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Sofia
 */
public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(String nombre, String numero, double saldo) {
        super(nombre, numero, saldo);
    }

    
     @Override
    public String toString() {
        return "CUENTA CORRIENTE: " + "TITULAR: " + nombre + ", NÚMERO: " + numero + ", SALDO: " + saldo + ", FECHA APERTURA: "+ fecha + "\n";
    }
    
     @Override
    public void Retirar(double monto) {

        if (saldo-monto < -500000) {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes, sobregiro excedido");

        } else {
            saldo -= monto;
            JOptionPane.showMessageDialog(null, "Retiro exitoso");
            JOptionPane.showMessageDialog(null, "Nuevo saldo= " + saldo);
        }
    }
}
