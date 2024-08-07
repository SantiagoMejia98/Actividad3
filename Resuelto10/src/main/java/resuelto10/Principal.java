package resuelto10;

public class Principal {
    public static void main(String[] args) {

        int numeroInscripcion = 3312;
        String nombre = "Santiago García";
        double patrimonio = 3000000;
        int estratoSocial = 4;

        Estudiante estudiante = new Estudiante(numeroInscripcion, nombre, patrimonio, estratoSocial);

        System.out.println(estudiante.mostrarDatos());

    }
}
