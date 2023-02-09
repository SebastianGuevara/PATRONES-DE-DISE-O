public class Koopa implements IEnemigoPrototype, IEnemigo {
    private int velocidad;
    private String ataque;

    public Koopa(int velocidad, String ataque) {
        this.velocidad = velocidad;
        this.ataque = ataque;
    }


    @Override
    public Koopa clonar() {
        return new Koopa(this.velocidad, this.ataque);
    }

    @Override
    public void visualizarEnemigo() {
        System.out.println("Un Koopa viene hacia tí con una velodidad de " + velocidad + " y te va a atacar con un " + ataque);

    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


}
