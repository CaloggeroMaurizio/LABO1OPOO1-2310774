package PC02;

import java.util.*;

	public class Hospital {
	    private List<Paciente> pacientes = new ArrayList<>();
	    private List<Medico> medicos = new ArrayList<>();

	    public static void main(String[] args) {
	        Hospital sistema = new Hospital();
	        Scanner scanner = new Scanner(System.in);

	        int opcion;
	        do {
	            System.out.println("1. Registrar paciente");
	            System.out.println("2. Eliminar paciente");
	            System.out.println("3. Modificar datos de paciente");
	            System.out.println("4. Mostrar peso más repetido");
	            System.out.println("5. Mostrar cantidad de pacientes con peso más repetido");
	            System.out.println("6. Mostrar peso mayor y menor");
	            System.out.println("7. Dividir rango de pesos y mostrar cantidad de pacientes en cada rango");
	            System.out.println("8. Mostrar lista de pacientes ordenados por nombre");
	            System.out.println("9. Mostrar médico que atendió a un paciente");
	            System.out.println("10. Buscar doctores");
	            System.out.println("0. Salir");
	            System.out.print("Ingrese opción: ");
	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    sistema.registrarPaciente();
	                    break;
	                case 2:
	                    sistema.eliminarPaciente();
	                    break;
	                case 3:
	                    sistema.modificarDatos();
	                    break;
	                case 4:
	                    sistema.mostrarPeso();
	                    break;
	                case 5:
	                    sistema.mostrarCantidadPesoRepetido();
	                    break;
	                case 6:
	                    sistema.mostrarPesosMyM();
	                    break;
	                case 7:
	                    sistema.mostrarRangoPesos();
	                    break;
	                case 8:
	                    sistema.mostrarOrdenApellido();
	                    break;
	                case 9:
	                    sistema.mostrarMedico();
	                    break;
	                case 10:
	                    sistema.buscarDoctores();
	                    break;
	                case 0:
	                    System.out.println("Saliendo");
	                    break;
	                default:
	                    System.out.println("ERROR. Intente nuevamente.");
	            }

	        } while (opcion != 0);
	    }

	    private void registrarPaciente() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("DNI del paciente:");
	        int dni = scanner.nextInt();
	        scanner.nextLine();

	        System.out.println("Nombre del paciente:");
	        String nombre = scanner.nextLine();

	        System.out.println("Dirección del paciente:");
	        String direccion = scanner.nextLine();

	        System.out.println("Peso del paciente:");
	        double peso = scanner.nextDouble();

	        System.out.println("Temperatura del paciente:");
	        double temperatura = scanner.nextDouble();

	        Paciente nuevoPaciente = new Paciente(dni, nombre, direccion, peso, temperatura);
	        pacientes.add(nuevoPaciente);

	        System.out.println("El paciente registrado con éxito.");
	    }

	    private void eliminarPaciente() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Posición del paciente a eliminar:");
	        int posicion = scanner.nextInt();

	        if (posicion >= 0 && posicion < pacientes.size()) {
	            pacientes.remove(posicion);
	            System.out.println("Paciente eliminado correctamente.");
	        } else {
	            System.out.println("ERROR. No se pudo eliminar el paciente.");
	        }
	    }

	    private void modificarDatos() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Posición del paciente a modificar:");
	        int posicion = scanner.nextInt();

	        if (posicion >= 0 && posicion < pacientes.size()) {
	            Paciente paciente = pacientes.get(posicion);

	            System.out.println("Nuevo peso del paciente:");
	            double nuevoPeso = scanner.nextDouble();
	            paciente.setPeso(nuevoPeso);

	            System.out.println("Nueva temperatura del paciente:");
	            double nuevaTemperatura = scanner.nextDouble();
	            paciente.setTemperatura(nuevaTemperatura);

	            System.out.println("Datos del paciente modificados correctamente.");
	        } else {
	            System.out.println("ERROR. No se pudo modificar los datos del paciente.");
	        }
	    }

	    private void mostrarPeso() {
	        Map<Double, Integer> frecuenciaPesos = new HashMap<>();

	        for (Paciente paciente : pacientes) {
	            double peso = paciente.getPeso();
	            frecuenciaPesos.put(peso, frecuenciaPesos.getOrDefault(peso, 0) + 1);
	        }

	        double pesoMasRepetido = Collections.max(frecuenciaPesos.entrySet(), Map.Entry.comparingByValue()).getKey();

	        System.out.println("Peso más repetitivo: " + pesoMasRepetido);
	    }

	    private void mostrarCantidadPesoRepetido() {
	        Map<Double, Integer> frecuenciaPesos = new HashMap<>();

	        for (Paciente paciente : pacientes) {
	            double peso = paciente.getPeso();
	            frecuenciaPesos.put(peso, frecuenciaPesos.getOrDefault(peso, 0) + 1);
	        }

	        double pesoMasRepetido = Collections.max(frecuenciaPesos.entrySet(), Map.Entry.comparingByValue()).getKey();
	        int cantidadPacientes = frecuenciaPesos.get(pesoMasRepetido);

	        System.out.println("Peso más repetitivo: " + pesoMasRepetido);
	        System.out.println("Cantidad de pacientes con ese peso: " + cantidadPacientes);
	    }

	    private void mostrarPesosMyM() {
	        double pesoMayor = Double.MIN_VALUE;
	        double pesoMenor = Double.MAX_VALUE;

	        for (Paciente paciente : pacientes) {
	            double peso = paciente.getPeso();
	            pesoMayor = Math.max(pesoMayor, peso);
	            pesoMenor = Math.min(pesoMenor, peso);
	        }

	        System.out.println("Peso mayor en la lista: " + pesoMayor);
	        System.out.println("Peso menor en la lista: " + pesoMenor);
	    }

	    private void mostrarRangoPesos() {
	        int rango1 = 0, rango2 = 0, rango3 = 0, rango4 = 0;

	        for (Paciente paciente : pacientes) {
	            double peso = paciente.getPeso();

	            if (peso >= 40 && peso < 60) {
	                rango1++;
	            } else if (peso >= 60 && peso < 80) {
	                rango2++;
	            } else if (peso >= 80 && peso < 100) {
	                rango3++;
	            } else if (peso >= 100 && peso <= 120) {
	                rango4++;
	            }
	        }

	        System.out.println("Pacientes en rango 40-60: " + rango1);
	        System.out.println("Pacientes en rango 60-80: " + rango2);
	        System.out.println("Pacientes en rango 80-100: " + rango3);
	        System.out.println("Pacientes en rango 100-120: " + rango4);
	    }

	    private void mostrarOrdenApellido() {
	        Collections.sort(pacientes, (p1, p2) -> p1.getApellido().compareTo(p2.getApellido()));

	        System.out.println("Lista de pacientes ordenados por nombres:");
	        for (Paciente paciente : pacientes) {
	            System.out.println("Nombre: " + paciente.getNombre());
	        }
	    }

	    private void mostrarMedico() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Posición del paciente:");
	        int posicion = scanner.nextInt();

	        if (posicion >= 0 && posicion < pacientes.size()) {
	            Paciente paciente = pacientes.get(posicion);
	            Medico medico = paciente.getMedico();

	            System.out.println("El medico que atendió al paciente fue:");
	            System.out.println("Nombre: " + medico.getNombre());
	            System.out.println("Especialidad: " + medico.getEspecialidad());
	        } else {
	            System.out.println("ERROR. No es posible obtener el médico que atendió al paciente.");
	        }
	    }

	    private void buscarDoctores() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Especialidad buscada:");
	        String especialidadBuscada = scanner.nextLine();

	        System.out.println("Doctores con la especialidad " + especialidadBuscada + ":");
	        for (Medico medico : medicos) {
	            if (medico.getEspecialidad().equalsIgnoreCase(especialidadBuscada)) {
	                System.out.println("Nombre: " + medico.getNombre());
	                System.out.println("Especialidad: " + medico.getEspecialidad());
	                System.out.println("--------------------------");
	            }
	        }
	    }
	}


