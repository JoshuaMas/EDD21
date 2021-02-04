package Bingo;
import java.util.ArrayList;
public class Jugador {
    public final ArrayList<Integer> Cartulina = new ArrayList<>();
    //Genera 10 números al azar para rellenar la cartulina
    public void generarCartolina(){
        for (int i = 1; i <= 10; i++) {
            int numeroRandom = (int) (Math.random() * 99 + 1);
            if (Cartulina.contains(numeroRandom)) {
                i--;
            } else {
                Cartulina.add(numeroRandom);
            }
        }
        for(Integer number: Cartulina) {
            System.out.print("\t" + number + " ");
        }
    }
}
