package EjerCalculadora;

import java.util.Scanner;

public class MainFrecuencias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = entrada.nextLine();
        System.out.print("Día de nacimiento: ");
        int dia = entrada.nextInt();
        System.out.print("Mes de nacimiento: ");
        int mes = entrada.nextInt();
        System.out.print("Año de nacimiento: ");
        int anio = entrada.nextInt();

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);

        System.out.printf("\nNombre: %s %s", persona.getNombre(), persona.getApellido());
        System.out.printf("\nFecha de nacimiento: %02d/%02d/%d", persona.getDia(), persona.getMes(), persona.getAnio());
        System.out.printf("\nEdad: %d años", persona.calcularEdad());
        System.out.printf("\nFrecuencia máxima: %d bpm", persona.frecuenciaMaxima());
        System.out.printf("\nRango esperado: %s bpm\n", persona.rangoFrecuenciaEsperada());
    }
}
