package propuesto19;

public class TrianguloEquilatero {

    private double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro(){
        return lado * 3;
    }

    public double calcularAltura() {
        return lado * Math.sqrt(3) / 2;
    }

    public double calcularArea(){
        return lado * calcularAltura() / 2;
    }

    public double getLado(){
        return lado;
    }

    public String mostrarDatos(){
        return "Lado: " + getLado() +
                "\nPerímetro: " + calcularPerimetro() +
                "\nAltura: " + calcularAltura() +
                "\nÁrea: " + calcularArea();
    }
}
