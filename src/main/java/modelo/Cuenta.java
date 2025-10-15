/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.time.LocalDate;
/**
 *
 * @author Sofia
 */
public class Cuenta {


    protected String nombre;
    protected String numero;
    protected double saldo;
    protected LocalDate fecha;

    public Cuenta(String nombre, String numero, double saldo) {
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
        this.fecha = LocalDate.now();
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

    public LocalDate getFecha() {
        return fecha;
    }
    

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", numero=" + numero + ", saldo=" + saldo + ", fecha de apertura=" + fecha + '}';
    }
    
    public void SumarSaldo(double incremento){
        saldo += incremento;
    }
    
    
     public void Retirar(double monto){
        saldo -= monto;
    }
    
}
