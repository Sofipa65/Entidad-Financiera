/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Sofia
 */
public class Cuenta {


    protected String nombre;
    protected String numero;
    protected double saldo;

    public Cuenta(String nombre, String numero, double saldo) {
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
    
    public void SumarSaldo(double incremento){
        saldo += incremento;
    }
    
     public void RestarSaldo(double descuento){
        saldo -= descuento;
    }
    
}
