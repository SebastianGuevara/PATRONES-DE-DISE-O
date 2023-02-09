package rines_concesionario;

public class Rin extends Forma {

    private int x, y, radio, tamaño;

    public Rin(int x, int y, int radio, int tamaño, IElegir elegirAPI) {

        super(elegirAPI);
        this.x = x;
        this.y = y;
        this.radio = radio;
        this.tamaño = tamaño;
    }

    public void elegir() {

        elegirAPI.elegirRin(radio, x, y, tamaño);
    }
}
