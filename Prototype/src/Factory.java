public class Factory {
    private IEnemigoPrototype dryBones;
    private IEnemigoPrototype koopa;
    private IEnemigoPrototype goomba;

    public Factory(IEnemigoPrototype dryBones, IEnemigoPrototype koopa, IEnemigoPrototype goomba) {
        this.dryBones = dryBones;
        this.koopa = koopa;
        this.goomba = goomba;
    }

    public IEnemigoPrototype getPrototypeDryBones() {
        return this.dryBones.clonar();
    }

    public IEnemigoPrototype getPrototypeKoopa() {
        return this.koopa.clonar();
    }

    public IEnemigoPrototype getPrototypeGoomba() {
        return this.goomba.clonar();
    }
}
