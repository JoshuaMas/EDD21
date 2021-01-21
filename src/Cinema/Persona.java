package Cinema;

public class Persona {
    int edad = (int) (Math.random()* 100);
    float dinero = (float) (Math.random() * 50);

    // Getters
    public int getEdad() {
        return edad;
    }
    public Float getDinero() {
        return (dinero);
    }


    // Setters

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }
    public void setEdad(int edad){
        this.edad = edad;

    }
}
