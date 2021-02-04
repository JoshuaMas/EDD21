package Bingo;
import java.util.*;
public class Maquina {
    ArrayList<Integer> numRegistrado = new ArrayList<>();
    Jugador j1 = new Jugador();
    Jugador j2 = new Jugador();
    public void Bombo(){
        generadorCartulinas();
        while (!j1.Cartulina.isEmpty() && !j2.Cartulina.isEmpty()){
            generadorNumeroRandom();
            if(j1.Cartulina.contains(generadorNumeroRandom())){
                j1.Cartulina.remove(Integer.valueOf(generadorNumeroRandom()));
            }else{
                numRegistrado.add(generadorNumeroRandom());
            }
            if(j2.Cartulina.contains(generadorNumeroRandom())){
                j2.Cartulina.remove(Integer.valueOf(generadorNumeroRandom()));
            }else{
                numRegistrado.add(generadorNumeroRandom());
            }
        }
        quienGana();
    }
    public void generadorCartulinas(){

        System.out.println("---------------------------------------------\n |Cartolina Jugador 1| ");
        j1.generarCartolina();
        System.out.println("\n---------------------------------------------\n |Cartolina Jugador 2| ");
        j2.generarCartolina();
        System.out.println("\n---------------------------------------------");
    }
    public void quienGana(){
        if(j2.Cartulina.isEmpty()){
            System.out.println("\n");
            System.out.println("El Ganador ha sido el jugador 2 ! \n");
            System.out.println("Números restantes en la cartulina del jugador 1: " + j1.Cartulina);
        }else if(j1.Cartulina.isEmpty()){
            System.out.println("\n");
            System.out.println("El Ganador ha sido el jugador 1 ! \n");
            System.out.println("Números restantes en la cartulina del jugador 2: " + j2.Cartulina);
        }
    }
    public int generadorNumeroRandom(){
        return (int) (Math.random() * 99 + 1);
    }
}