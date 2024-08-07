package propuesto18;

public class Principal {
    public static void main(String[] args) {

        String codigoEmpleado = "A1245";
        String nombresEmpleado = "Juan Perez";
        double horasTrabajadas = 115;
        double valorHora = 36000;
        double porcentajeRetencion = 12.0;

        Empleado empleado = new Empleado(codigoEmpleado, nombresEmpleado, horasTrabajadas, valorHora, porcentajeRetencion);

        System.out.println(empleado.mostrarDatos());
    }
}
