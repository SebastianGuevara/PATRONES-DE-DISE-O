public class Goomba implements IEnemigoPrototype, IEnemigo {
    private int velocidad;
    private String ataque;

    public Goomba(int velocidad, String ataque) {
        this.velocidad = velocidad;
        this.ataque = ataque;
    }

    @Override
    public Goomba clonar() {
        return new Goomba(this.velocidad, this.ataque);
    }

    @Override
    public void visualizarEnemigo() {
        System.out.println("Un Goomba viene hacia tí con una velodidad de " + velocidad + " y te va a atacar con un " + ataque);

    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
