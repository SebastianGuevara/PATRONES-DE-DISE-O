public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory(new DryBones(0, "Puño"), new Koopa(0, "Patada"), new Goomba(50, ""));

        DryBones dryBones = (DryBones) factory.getPrototypeDryBones();
        dryBones.setVelocidad(100);
        dryBones.visualizarEnemigo();

        DryBones dryBones2 = (DryBones) factory.getPrototypeDryBones();
        dryBones2.setVelocidad(155);
        dryBones2.visualizarEnemigo();

        Goomba goomba = (Goomba) factory.getPrototypeGoomba();
        goomba.setAtaque("Cabezaso");
        goomba.visualizarEnemigo();

        Koopa koopa = (Koopa) factory.getPrototypeKoopa();
        koopa.setVelocidad(75);
        koopa.visualizarEnemigo();
    }
}