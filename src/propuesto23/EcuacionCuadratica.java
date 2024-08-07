package propuesto23;

public class EcuacionCuadratica {

    private double a;
    private double b;
    private double c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String resolverEcuacion(){
        double d = d = Math.pow(b, 2) - (4 * a * c);

        if(d > 0){
            double solucion1, solucion2;

            solucion1 = (-1 * b + Math.sqrt(d)) / (2 * a);
            solucion2 = (-1 * b - Math.sqrt(d)) / (2 * a);

            return "La ecuación tiene 2 soluciones" +
                    "\nSolución 1: " + solucion1 +
                    "\nSolución 2: " + solucion2;

        }else if(d == 0){
            double solucion = (-1 * b) / (2 * a);

            return "La ecuacion tiene solucion unica" +
                    "\nSolución: " + solucion;
        }
        return "La ecuación no tiene solución en los reales";
    }
}
