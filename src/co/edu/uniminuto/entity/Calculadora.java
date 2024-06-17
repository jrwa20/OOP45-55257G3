package co.edu.uniminuto.entity;

public class Calculadora {
    // 1. Declaro atributos o propiedades
    private double suma;
    private double resta;
    private double multiplicacion;
    private double division;
    private double modulo;
    private double potencia;
    private double raizCuadrada;
    private double absoluto;

    // 2. Métodos constructores

    public Calculadora() {
        this.suma = 0;
        this.resta = 0;
        this.multiplicacion = 0;
        this.division = 0;
        this.modulo = 0;
        this.potencia = 0;
        this.raizCuadrada = 0;
        this.absoluto = 0;
    }

    public Calculadora(double suma, double resta, double multiplicacion, double division, double modulo, double potencia, double raizCuadrada, double absoluto) {
        this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
        this.division = division;
        this.modulo = modulo;
        this.potencia = potencia;
        this.raizCuadrada = raizCuadrada;
        this.absoluto = absoluto;
    }

    // 3. Métodos de acceso

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double getResta() {
        return resta;
    }

    public void setResta(double resta) {
        this.resta = resta;
    }

    public double getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(double multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public double getDivision() {
        return division;
    }

    public void setDivision(double division) {
        this.division = division;
    }

    public double getModulo() {
        return modulo;
    }

    public void setModulo(double modulo) {
        this.modulo = modulo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getRaizCuadrada() {
        return raizCuadrada;
    }

    public void setRaizCuadrada(double raizCuadrada) {
        this.raizCuadrada = raizCuadrada;
    }

    public double getAbsoluto() {
        return absoluto;
    }

    public void setAbsoluto(double absoluto) {
        this.absoluto = absoluto;
    }

    // 4. Métodos para realizar las operaciones matemáticas
    public void calcularSuma(double a, double b) {
        this.suma = a + b;
    }

    public void calcularResta(double a, double b) {
        this.resta = a - b;
    }

    public void calcularMultiplicacion(double a, double b) {
        this.multiplicacion = a * b;
    }

    public void calcularDivision(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        this.division = a / b;
    }

    public void calcularModulo(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        this.modulo = a % b;
    }

    public void calcularPotencia(double a, double b) {
        this.potencia = Math.pow(a, b);
    }

    public void calcularRaizCuadrada(double a) {
        if (a < 0) {
            throw new ArithmeticException("Raíz cuadrada de número negativo no permitida.");
        }
        this.raizCuadrada = Math.sqrt(a);
    }

    public void calcularAbsoluto(double a) {
        this.absoluto = Math.abs(a);
    }
}
