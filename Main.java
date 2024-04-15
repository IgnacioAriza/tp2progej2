import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sca = new Scanner(System.in);
        Novela n1 = new Novela(1985,"Cormac McCarthy",false,"Blood Meridian","Western");
        Infantil i1 = new Infantil(2001,"Elizabetha Dami",false,"Geronimo Stilton",7);
        Universitario u1 = new Universitario(2020,"Catherine A. Makarewich",false,"Experimental Cell Research","Biologia");
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(n1);
        biblioteca.agregarLibro(i1);
        biblioteca.agregarLibro(u1);

        System.out.println();

        biblioteca.listarLibros();

        System.out.println();

        biblioteca.prestar(n1);
        biblioteca.prestar(i1);
        biblioteca.devolver(n1);

        System.out.println();

        biblioteca.listarLibros();
    }
}
