public class Monster {
    final String monsterElementType;

    public Monster(String monsterElementType) {
        this.monsterElementType = monsterElementType;
    }

    public void receiveMortalDamage(Wizard wizard) {
        if (wizard.getAttackStrategy().useMagic().equals(monsterElementType)) {
            System.out.println("No Damage");
        } else {
            System.out.println("Damage");
        }
    }
}
