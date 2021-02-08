package Estanteria;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
        Estanteria e = new Estanteria();
        Libro l1 = new Libro("Gustavo", "Carry Potter y el juanmita perdido", 8);
        Libro l2 = new Libro("MBeltran", "En busca del Gachapon", 9);
        e.añadirLibro(l1);
        e.añadirLibro(l2);
        Libro l3 = new Libro("Adan", "Pomares y su penoso 9", 5);
        Libro l4 = new Libro("Cervantes", "Don Ivan de la Mancha", 6);
        Libro l5 = new Libro("Riot", "200 años desarrollando videojuegos.", 7);
        e.añadirLibro(l3);
        e.añadirLibro(l4);
        e.añadirLibro(l5);
        e.top10();
        e.eliminarLibro("Adan");
        e.top10();

        e.verEstanteria();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
