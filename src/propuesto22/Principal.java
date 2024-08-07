package propuesto22;

public class Principal {
    public static void main(String[] args) {

        String nombre = "Santiago Mejia";
        double horasTrabajadas = 10;
        double salarioHora = 45000;

        Empleado empleado = new Empleado(nombre, horasTrabajadas, salarioHora);

        System.out.println(empleado.mostrarDatos());
    }
}
