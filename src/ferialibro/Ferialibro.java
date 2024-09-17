
package ferialibro;


import java.util.Scanner;

public class Ferialibro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el título del libro:");
        String titulo = entrada.nextLine();
        
        System.out.println("Ingrese el autor del libro:");
        String autor = entrada.nextLine();
        
        System.out.println("Ingrese el precio del libro:");
        double precio = entrada.nextDouble();
        entrada.nextLine(); 

        System.out.println("Ingrese el tipo de libro (texto/investigacion):");
        String tipoLibro = entrada.nextLine();

        if (tipoLibro.equalsIgnoreCase("texto")) {
            System.out.println("Ingrese el curso al que está asociado el libro:");
            String curso = entrada.nextLine();
            
            LibroTexto libroTexto = new LibroTexto(titulo, autor, precio, curso);
            libroTexto.mostrarDatos();
        } else if (tipoLibro.equalsIgnoreCase("investigacion")) {
            System.out.println("Ingrese el curso al que está asociado el libro:");
            String curso = entrada.nextLine();
            
            System.out.println("Ingrese la facultad que publicó el libro:");
            String facultad = entrada.nextLine();
            
            LibroInvestigacion libroInvestigacion = new LibroInvestigacion(titulo, autor, precio, curso, facultad);
            libroInvestigacion.mostrarDatos();
        } else {
            System.out.println("Tipo de libro no válido.");
        }

        entrada.close();
    }
}

