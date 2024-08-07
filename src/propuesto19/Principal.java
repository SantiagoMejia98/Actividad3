package propuesto19;

public class Principal {
    public static void main(String[] args) {

        double lado = 12;

        TrianguloEquilatero triangulo = new TrianguloEquilatero(lado);

        System.out.println(triangulo.mostrarDatos());
    }
}
