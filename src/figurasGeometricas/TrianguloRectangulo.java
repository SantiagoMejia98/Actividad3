package figurasGeometricas;

public class TrianguloRectangulo {

    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura / 2;
    }

    public double calcularHipotenusa() {
        return Math.pow(Math.pow(base,2) + Math.pow(altura,2), 0.5);
    }

    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    public String determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();

        if (base == altura && base == hipotenusa)
            return "Triángulo equilátero";
        else if (base == altura || base == hipotenusa || hipotenusa == altura){
            return "Triángulo isósceles";
        }
        return "Triángulo escaleno";
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String mostrarTriangulo() {
        return "Figura : Triángulo rectángulo" +
                "\nBase : " + getBase() +
                "\nAltura : " + getAltura() +
                "\nÁrea : " + calcularArea() +
                "\nPerímetro : " + calcularPerimetro() +
                "\nHipotenusa : " + calcularHipotenusa() +
                "\nTipo Triángulo : " + determinarTipoTriangulo();
    }
}
