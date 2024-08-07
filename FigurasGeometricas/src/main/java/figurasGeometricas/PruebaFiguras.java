package figurasGeometricas;

public class PruebaFiguras {
    public static void main(String[] args) {

        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);

        System.out.println(figura1.mostrarCirculo());
        System.out.println(figura2.mostrarRectangulo());
        System.out.println(figura3.mostrarCuadrado());
        System.out.println(figura4.mostrarTriangulo());
    }
}
