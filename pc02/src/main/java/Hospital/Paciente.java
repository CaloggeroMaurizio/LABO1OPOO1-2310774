/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author Alumno
 */
public class Paciente {
    private double DNI;
    private String nombre;
    private String direccion;           
    private double peso;
    private double temperatura;
       
public Paciente(double DNI, String nombre, String direccion, int peso, double temperatura) {
  this.DNI = DNI;
  this.nombre = nombre;
  this.direccion = direccion;
  this.peso = peso;
  this.temperatura = temperatura;
}

    Paciente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

public double getDNI() {
  return DNI;
}

public void setDNI(double DNI) {
  this.DNI = DNI;
  
}

public String getNombre() {
  return nombre;
}

public void setNombre(String nombre) {
  this.nombre = nombre;
}

public String getDireccion() {
  return direccion;
}

public void setDireccion(String direccion) {
  this.direccion = direccion;
}

public double getPeso() {
  return (double) peso;
}

public void setPeso(double peso) {
  this.peso = peso;
}

public double getTemperatura() {
  return temperatura;
}

public void setTemperatura(double temperatura) {
  this.temperatura = temperatura;
}    

    void setDni(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}




