
package ferialibro;


public class LibroTexto extends Libro {
    private String curso;

    public LibroTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Método para calcular el precio con descuento
    public double calcularDescuento() {
        return precio * 0.60;  // 40% de descuento
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Curso: %s%nPrecio con descuento: $%.2f%n", curso, calcularDescuento());
    }
}
