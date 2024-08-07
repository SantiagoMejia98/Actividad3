package resuelto7;

public class Comparador {

    private double numeroA;
    private double numeroB;

    public Comparador(double numeroA, double numeroB) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }

    public String comparar(){
        if(numeroA > numeroB) {
            return "A es mayor que B";
        }else if(numeroA == numeroB) {
            return "A es igual que B";
        }
        return "A es menor que B";
    }

    public double getNumeroA() {
        return numeroA;
    }

    public double getNumeroB() {
        return numeroB;
    }

    public String mostrarDatos(){
        return "Número A: " + getNumeroA() +
                "\nNúmero B: " + getNumeroB() +
                "\nComparación: " + comparar();
    }
}
