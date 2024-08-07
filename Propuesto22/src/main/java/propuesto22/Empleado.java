package propuesto22;

public class Empleado {

    private String nombre;
    private double horasTrabajadas;
    private double salarioHora;

    public Empleado(String nombre, double horasTrabajadas, double salarioHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.salarioHora = salarioHora;
    }

    public double calcularSalario(){
        return horasTrabajadas * salarioHora;
    }

    public String getNombre() {
        return nombre;
    }

    public String mostrarDatos(){
        double salario = calcularSalario();

        if(salario > 450000){
            return "Nombre: " + getNombre() +
                    "\nSalario: " + calcularSalario() ;
        }
        return "Nombre: " + getNombre();
    }
}
