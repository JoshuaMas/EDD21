package Estanteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Estanteria {
    ArrayList<Libro> Estanteria= new ArrayList();
    public Estanteria(){

    }
    public void añadirLibro(Libro libro) throws Exception {
        if (Estanteria.size()<=10){
        Estanteria.add(libro);
        }else{
            throw new Exception("Estantería llena.");
        }
    }

    public void eliminarLibro(String Prueba)  {
        for (int i = 0; i < Estanteria.size(); i++) {
            Libro libro=Estanteria.get(i);
                if (Prueba.equals(libro.getAutor()) | Prueba.equals(libro.getTitulo()) ){
                    Librovacio();
                    Estanteria.set(i,Librovacio());
                    System.out.println("El libro " + libro.getTitulo() + " ha sido retirado de la estanteria.");
                }
        }
    }
    public void top10(){
        System.out.println("-------------------------------------------------\n"+"Top de los libros por calificacion:\n-------------------------------------------------");
        Collections.sort(Estanteria, Comparator.comparing(Libro::getCalificacion));
        Collections.reverse(Estanteria);
        for (int i = 0; i < Estanteria.size(); i++) {
            int x=i+1;
            System.out.println("Top:\t" + x + "\nAutor:\t" + Estanteria.get(i).getAutor() + "\nTitulo:\t" + Estanteria.get(i).getTitulo()
                    + "\nCalificación:\t" + Estanteria.get(i).getCalificacion()+"\n-------------------------------------------------");
        }
    }
    public void verEstanteria() {
        for (int i = 0; i < Estanteria.size(); i++) {
            System.out.println("\nAutor:\t" + Estanteria.get(i).getAutor() + "\nTitulo:\t" + Estanteria.get(i).getTitulo()
                    + "\nCalificación:\t" + Estanteria.get(i).getCalificacion());
        }
    }
    public Libro Librovacio(){
        Libro sad = new Libro("vacio","vacio",0);
        return sad;
    }
}

