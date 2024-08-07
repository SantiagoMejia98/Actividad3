package figurasGeometricas;

public class Cuadrado {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }

    public String mostrarCuadrado() {
        return "Figura : Cuadrado" +
                "\nLado : " + getLado() +
                "\nÁrea : " + calcularArea() +
                "\nPerímetro : " + calcularPerimetro();
    }
}
