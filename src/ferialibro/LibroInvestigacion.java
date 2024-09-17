
package ferialibro;

public class LibroInvestigacion extends LibroTexto {
    private String facultad;

    public LibroInvestigacion(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    
    public double calcularDescuento() {
        return super.getPrecio() * 0.75;  // 25% de descuento
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Facultad: %s%nPrecio con descuento para UdeC: $%.2f%n", facultad, calcularDescuento());
    }
}
