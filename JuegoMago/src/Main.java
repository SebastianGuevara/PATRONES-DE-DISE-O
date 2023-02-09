public class Main {
    public static void main(String[] args) {
        Wizard wizardJuan = new Wizard();
        Wizard wizardCamila = new Wizard();
        Wizard wizardSantiago = new Wizard();
        Monster fireMonster = new Monster("fire");

        wizardJuan.setAttackStrategy(new DarkMagicAttack());
        wizardCamila.setAttackStrategy(new FireMagicAttack());
        wizardSantiago.setAttackStrategy(new IceMagicAttack());

        fireMonster.receiveMortalDamage(wizardCamila);
        fireMonster.receiveMortalDamage(wizardSantiago);
        fireMonster.receiveMortalDamage(wizardJuan);
    }
}