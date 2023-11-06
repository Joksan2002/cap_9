package cap_9;

public class PruebaCuadrilatero {
    public static void main(String[] args) {
        // Crear instancias de Puntos
        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(0, 4);
        Punto punto3 = new Punto(3, 4);
        Punto punto4 = new Punto(3, 0);

        // Crear instancias de las formas
        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3, punto4, 10);
        Rectangulo rectangulo = new Rectangulo(punto1, punto2, punto3, punto4, 4, 7);
        Paralelogramo paralelogramo = new Paralelogramo(punto1, punto2, punto3, punto4, 9, 6);
        Trapezoide trapecio = new Trapezoide(punto1, punto2, punto3, punto4, 13, 5, 8 );

        // Calcular y mostrar el área de cada forma
        System.out.println("Área del Cuadrado: " + cuadrado.getArea());
        System.out.println("Área del Rectángulo: " + rectangulo.getArea());
        System.out.println("Área del Paralelogramo: " + paralelogramo.getArea());
        System.out.println("Área del Trapecio: " + trapecio.getArea());
    }
    
}
