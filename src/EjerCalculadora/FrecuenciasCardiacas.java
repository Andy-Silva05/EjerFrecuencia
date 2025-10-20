package EjerCalculadora;
import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int anio;

    public FrecuenciasCardiacas() {}

    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setDia(int dia) { this.dia = dia; }
    public void setMes(int mes) { this.mes = mes; }
    public void setAnio(int anio) { this.anio = anio; }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnio() { return anio; }

    public int calcularEdad() {
        LocalDate nacimiento = LocalDate.of(anio, mes, dia);
        LocalDate hoy = LocalDate.now();
        return Period.between(nacimiento, hoy).getYears();
    }

    public int frecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public String rangoFrecuenciaEsperada() {
        double min = frecuenciaMaxima() * 0.5;
        double max = frecuenciaMaxima() * 0.85;
        return String.format("%.1f - %.1f", min, max);
    }
}
