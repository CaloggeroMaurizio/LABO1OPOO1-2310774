/*

 */
package Hospital;
public class Main {

  public static void main(String[] args) {


    GestionPacientes gestionPacientes = new GestionPacientes();

    // Registra un paciente
    gestionPacientes.registrarPaciente(123456789, "Juan Pérez", "Av. San Martín 123", 75, 37.5);

    // Registra otro paciente
    gestionPacientes.registrarPaciente(987654321, "María López", "Calle Las Flores 456", 65, 38.7);

    // Imprime la lista de pacientes
    System.out.println(gestionPacientes.getPacientes());
  }
}



   

    

 
   
    