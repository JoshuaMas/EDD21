package Estanteria;

public class Libro {
    String autor;
    String titulo;
    int calificacion;

    public Libro(String autor, String titulo, int calificacion) {
        this.autor = autor;
        this.titulo = titulo;
        this.calificacion = calificacion;
    }

    // Getters
    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCalificacion() {
        return calificacion;
    }

    // Setters
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
