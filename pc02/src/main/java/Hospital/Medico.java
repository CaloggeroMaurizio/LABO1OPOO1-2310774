/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author Alumno
 */
public class Medico {
    private double numerocolegiatura;
    private String nombre;
    private String especialidad;

public Medico(double numerocolegiatura, String nombre, String especialidad) {
  this.numerocolegiatura = numerocolegiatura;
  this.nombre = nombre;
  this.especialidad = especialidad;
}

public double getColegiatura() {
  return numerocolegiatura;
}

public void setColegiatura(double colegiatura) {
  this.numerocolegiatura = numerocolegiatura;
}

public String getNombre() {
  return nombre;
}

public void setNombre(String nombre) {
  this.nombre = nombre;
}

public String getEspecialidad() {
  return especialidad;
}

public void setEspecialidad(String especialidad) {
  this.especialidad = especialidad;
}

}



