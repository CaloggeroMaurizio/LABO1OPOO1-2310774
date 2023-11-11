package PC02;

public class Paciente {
	 int DNI;
	    String nombre;
	    String Dirección;
	    double Peso;
	    double temperatura;
	    Medico medico;

	    public Paciente(int DNI, String nombre, String direccion, double peso, double temperatura) {
	        this.DNI = DNI;
	        this.nombre = nombre;
	        this.Dirección = direccion;
	        this.Peso = peso;
	        this.temperatura = temperatura;
	    }
	    public double getPeso() {
	        return Peso;
	    }

	    public void setPeso(double peso) {
	        this.Peso = peso;
	    }

	    public double getTemperatura() {
	        return temperatura;
	    }

	    public void setTemperatura(double temperatura) {
	        this.temperatura = temperatura;
	    }

	    public Medico getMedico() {
	        return medico;
	    }

	    public void setMedico(Medico medico) {
	        this.medico = medico;
	    }

	    public String getApellido() {
	        return "";
	    }

	    public String getNombre() {
	        return nombre;
	    }
	}

