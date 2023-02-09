package rines_concesionario;

public abstract class Forma {

    protected IElegir elegirAPI;

    public Forma(IElegir elegirAPI) {
        this.elegirAPI = elegirAPI;
    }

    public abstract void elegir();
}
