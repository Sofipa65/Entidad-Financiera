/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import modelo.Cuenta;
import modelo.CuentaDeAhorros;
import modelo.CuentaCorriente;

/**
 *
 * @author Sofia
 */
public class EntidadFinanciera {
    
     static ArrayList<Cuenta> cuentas= new ArrayList<>();

    public static void main(String[] args) {
        
        int opcion;
        do{ 
        opcion= Integer.parseInt(JOptionPane.showInputDialog("""
                                                             Menu 
                                                             1. Crear cuenta 
                                                             2. Mostrar datos de cuenta 
                                                             3. Realizar reembolso 
                                                             4. Realizar consignación
                                                             5. Realizar retiro
                                                             6. Salir
                                                             Elija una opción: """)); 
        switch (opcion){
            case 1 -> {
                String nombre= JOptionPane.showInputDialog("Nombre del titular: ");
                int tipo= Integer.parseInt(JOptionPane.showInputDialog("Indique el tipo de cuenta que desea crear\n 1. Ahorros   2. Corriente"));
                
                int op= Integer.parseInt(JOptionPane.showInputDialog("¿Desea ingresar saldo inicial?\n 1. SI   2. NO"));
                if (op==1){
                    double saldo= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto del saldo inicial: "));
                    crearCuenta(nombre, saldo, tipo);
                }
                else if (op==2) {
                  crearCuenta(nombre, tipo);  
                }
            }
            case 2 -> mostrarCuentas();
            case 3 -> reembolsar();
            case 4 -> consignar();
            case 5 -> retirar();
            case 6 -> {
                JOptionPane.showMessageDialog(null, "Saliendo del sistema");
            }
            default -> JOptionPane.showMessageDialog(null, "Opción inválida");
        }        
        }while(opcion !=6);
        
    }
    
    public static void crearCuenta(String nombre, double saldo, int tipo){
         
         if (tipo==1){
             String numero;
             numero = "AHO-" + ((int) (Math.random() * 90000) + 10000);
             
            Cuenta cuenta= new CuentaDeAhorros(nombre,numero, saldo);
            cuentas.add(cuenta);
         }
         else if (tipo==2){
             String numero;
             numero = "COR-" + ((int) (Math.random() * 90000) + 10000);
             
             Cuenta cuenta= new CuentaCorriente(nombre,numero, saldo);
             cuentas.add(cuenta);
         }
    }
    
    public static void crearCuenta(String nombre, int tipo){
         
         if (tipo==1){
             String numero;
             numero = "AHO-" + ((int) (Math.random() * 90000) + 10000);
             
             Cuenta cuenta= new CuentaDeAhorros(nombre,numero, 0);
             cuentas.add(cuenta);
         }
         else if (tipo==2){
             String numero;
             numero = "COR-" + ((int) (Math.random() * 90000) + 10000);
             
             Cuenta cuenta= new CuentaCorriente(nombre,numero, 0);
             cuentas.add(cuenta);
         }
    }
    

    public static void mostrarCuentas(){
        
        String lista= cuentas.toString();
        JOptionPane.showMessageDialog(null, lista);
    }
    
    
    public static void reembolsar(){
       String titularBuscado= JOptionPane.showInputDialog("Ingrese el nombre del titular de la cuenta"); 
       for(Cuenta c : cuentas){
           
           if (c.getNombre().equalsIgnoreCase(titularBuscado)){
               
               double monto= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a reembolsar: "));
               c.SumarSaldo(monto);
               JOptionPane.showMessageDialog(null, "Nuevo saldo= " + c.getSaldo());
               return;
           }      
       }
       JOptionPane.showMessageDialog(null, "Cuenta no encontrada.");
    }
    
     public static void consignar(){
       String titularBuscado= JOptionPane.showInputDialog("Ingrese el nombre del titular de la cuenta"); 
       for(Cuenta c : cuentas){
           
           if (c.getNombre().equalsIgnoreCase(titularBuscado)){
               
               double monto= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto que desea consignar en la cuenta: "));
               c.SumarSaldo(monto);
               JOptionPane.showMessageDialog(null, "Consignación exitosa");
               JOptionPane.showMessageDialog(null, "Nuevo saldo= " + c.getSaldo());
               return;
           }
       }
        JOptionPane.showMessageDialog(null, "Cuenta no encontrada.");
   }
     
      public static void retirar(){
       String titularBuscado= JOptionPane.showInputDialog("Ingrese el nombre del titular de la cuenta"); 
       for(Cuenta c : cuentas){
           
           if (c.getNombre().equalsIgnoreCase(titularBuscado)){
               
               double monto= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar: "));
               
               c.Retirar(monto);
               return;
           }     
       }
       JOptionPane.showMessageDialog(null, "Cuenta no encontrada.");
    }
     
}
