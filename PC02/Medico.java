package PC02;

public class Medico {
    int numerocolegiatura;
    String nombre;
    String especialidad;

    public Medico(int numColegiatura, String nombre, String especialidad) {
        this.numerocolegiatura = numColegiatura;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getNumColegiatura() {
        return numerocolegiatura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}


