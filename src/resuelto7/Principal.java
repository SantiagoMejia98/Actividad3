package resuelto7;

public class Principal {
    public static void main(String[] args) {

        double numeroA = 1;
        double numeroB = 3;

        Comparador comparador = new Comparador(numeroA, numeroB);

        System.out.println(comparador.mostrarDatos());
    }
}
