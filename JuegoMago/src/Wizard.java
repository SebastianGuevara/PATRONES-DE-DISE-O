public class Wizard {
    private IAttackStrategy attackStrategy;

    public void setAttackStrategy(IAttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public IAttackStrategy getAttackStrategy() {
        return attackStrategy;
    }
}
