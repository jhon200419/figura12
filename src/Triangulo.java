class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    double calcularArea() {
        // Supongamos que el área del triángulo se calcula de alguna manera específica
        // para este ejemplo, simplemente retornaremos 0.0
        return 0.0;
    }
}
