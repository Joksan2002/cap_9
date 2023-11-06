package cap_9;

public class Cuadrilatero {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    private Punto punto4;

    public Cuadrilatero(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }
    public double getArea() {
        // Implementar el cálculo del área para Cuadrilatero
        return 0.0;
    }
}

class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

// Subclase Trapezoide
class Trapezoide extends Cuadrilatero {
    // Implementa su lógica específica
    private double baseMayor;
    private double baseMenor;
    private double altura;

    public Trapezoide(Punto punto1, Punto punto2, Punto punto3, Punto punto4, double baseMayor, double baseMenor, double altura) {
        super(punto1, punto2, punto3, punto4);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }
    @Override
    public double getArea() {
        //Implementa el cálculo de área para un paralelogramo
        return ((baseMayor + baseMenor) / 2) * altura;// Fórmula del área del paralelogramo
    }
}

class Paralelogramo extends Cuadrilatero {
     private double base;
     private double altura;

     public Paralelogramo(Punto punto1, Punto punto2, Punto punto3, Punto punto4, double base, double altura) {
        super(punto1, punto2, punto3, punto4);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base * altura;
    }
}

class Rectangulo extends Cuadrilatero {
    private double base;
    private double altura;

    public Rectangulo(Punto punto1, Punto punto2, Punto punto3, Punto punto4, double base, double altura) {
        super(punto1, punto2, punto3, punto4);
        this.base = base;
        this.altura= altura;
    }

    @Override
    public double getArea() {
        return base * altura;
    } 
}

class Cuadrado extends Cuadrilatero {
    private double lado;

    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4, double lado) {
        super(punto1, punto2, punto3, punto4);
        this.lado = lado;
    }
    
    @Override
    public double getArea() {
        return lado*lado;
    } 
}