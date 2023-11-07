package cap_9;

public class PruebaEmpleadosPorHoras {
    public static void main(String[] args){

        // crea instancia de objeto EmpleadoPorComision
        EmpleadosPorHoras empleado = new EmpleadosPorHoras(
        "Karl", "Stons", "222-22-2222",
         50, 50);
    
        // obtiene datos del empleado por comisión
        System.out.println("Informacion del empleado obtenida por los metodos establecer:");
        System.out.printf("%s %s%n", "El primer nombre es",
        empleado.obtenerPrimerNombre());
        System.out.printf("%s %s%n", "El apellido paterno es",
        empleado.obtenerApellidoPaterno());
        System.out.printf("%s %s%n", "El numero de seguro social es",
        empleado.obtenerNumeroSeguroSocial());
        System.out.printf("%s: %.2f%n", "Las ventas brutas son",
        empleado.obtenerHora());
        System.out.printf("%s %.2f%n", "La tarifa de comision es",
        empleado.obtenerSueldo());
    
        empleado.establecerHoras(45); 
        empleado.establecerSueldo(59);
    
        System.out.printf("%n%s:%n%n%s%n",
        "Informacion actualizada del empleado, obtenida mediante toString", empleado);
        }
}
