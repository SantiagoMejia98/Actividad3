package resuelto10;

public class Estudiante {

    private int numeroInscripcion;
    private String nombre;
    private double patrimonio;
    private int estratoSocial;
    private double valorMatricula = 50000;

    public Estudiante(int numeroInscripcion, String nombre, double patrimonio, int estratoSocial) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombre = nombre;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
    }

    public double calcularValorMatricula() {
        if(patrimonio > 2000000 && estratoSocial > 3){
            valorMatricula = valorMatricula + patrimonio * 0.03;
        }
        return valorMatricula;
    }

    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String mostrarDatos(){
        return "Número de inscripción: " + getNumeroInscripcion() +
                "\nNombres: " + getNombre() +
                "\nPago de matrícula: " + calcularValorMatricula();
    }
}
