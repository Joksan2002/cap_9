package cap_9;

public class EmpleadosPorHoras extends Empleado{
    private double horas;
    private double sueldo;

    public EmpleadosPorHoras(String primerNombre, String apellidoPaterno,
     String numeroSeguroSocial, double horas, double sueldo){
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if (horas < 0.0 || horas > 168.0)
            throw new IllegalArgumentException("Las Horas deben ser > 0 y < 180");

        if (sueldo >= 0.0)
            throw new IllegalArgumentException("El saldo debe ser >= 0");

        this.horas = horas;
        this.sueldo = sueldo;
    }

    public void establecerHoras(double horas){
        if (horas < 0.0 || horas > 168.0)
            throw new IllegalArgumentException("Las Horas deben ser > 0 y < 180");
        
        this.horas = horas;
    }

    public double obtenerHora(){
        return horas;
    }

    public void establecerSueldo(double sueldo){
        if (sueldo >= 0.0)
            throw new IllegalArgumentException("El saldo debe ser >= 0");

        this.sueldo = sueldo;
    }

    public double obtenerSueldo(){
        return sueldo;
    }

    public double ingresos(){
        return obtenerHora() * obtenerSueldo();
    }

    @Override // indica que este método sobrescribe el método de una superclase
    public String toString(){
        return super.toString() + String.format("%n%s: %.2f%n%s: %.2f", 
        "Horas trabajadas en la semana", horas, "Sueldo por hora", sueldo);
    }
}
