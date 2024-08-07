package figurasGeometricas;

public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio,2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double getRadio() {
        return radio;
    }

    public String mostrarCirculo() {
        return "Figura : Círculo" +
                "\nRadio : " + getRadio() +
                "\nÁrea : " + calcularArea() +
                "\nPerímetro : " + calcularPerimetro();
    }
}