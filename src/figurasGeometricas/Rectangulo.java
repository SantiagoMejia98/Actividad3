package figurasGeometricas;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String mostrarRectangulo() {
        return "Figura : Rectángulo" +
                "\nBase : " + getBase() +
                "\nAltura : " + getAltura() +
                "\nÁrea : " + calcularArea() +
                "\nPerímetro : " + calcularPerimetro();
    }
}
