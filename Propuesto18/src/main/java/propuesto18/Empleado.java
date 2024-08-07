package propuesto18;

public class Empleado {

    private String nombre;
    private String codigo;
    private double horasTrabajadas;
    private double valorHora;
    private double porcetajeRetencion;

    public Empleado(String nombre, String codigo, double horasTrabajadas, double valorHora, double porcetajeRetencion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.porcetajeRetencion = porcetajeRetencion;
    }

    public double calcularSalarioBruto(){
        return horasTrabajadas * valorHora;
    }

    public double calcularSalarioNeto(){
        double salarioBruto = calcularSalarioBruto();
        double retencion = salarioBruto * (porcetajeRetencion / 100);
        return salarioBruto - retencion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String mostrarDatos(){
        return "Nombre: " + getNombre() +
                "\nCódigo: " + getCodigo() +
                "\nSalario Bruto: " + calcularSalarioBruto() +
                "\nSalario Neto: " + calcularSalarioNeto();
    }
}
