package propuesto23;

public class Principal {
    public static void main(String[] args) {

        double a = 2;
        double b = 4;
        double c = 2;

        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);

        System.out.println(ecuacion.resolverEcuacion());
    }
}
