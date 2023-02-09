public class DryBones implements IEnemigoPrototype, IEnemigo {
    private int velocidad;
    private String ataque;

    public DryBones(int velocidad, String ataque) {
        this.velocidad = velocidad;
        this.ataque = ataque;
    }

    @Override
    public DryBones clonar() {
        return new DryBones(this.velocidad, this.ataque);
    }

    @Override
    public void visualizarEnemigo() {
        System.out.println("Un Dry Bones viene hacia tí con una velodidad de " + velocidad + " y te va a atacar con un " + ataque);
    }


    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

}
