package simpleGame.model;

 public class Attacker extends GameCharacter {


    private static final double ATTACK_BONUS = 1.2;

    public Attacker(String name, double attackPower, double defencePower, double health) {
        super(name, attackPower, defencePower, health);

    }

    @Override
    public double totalAttack() {
        return getAttackPower() * ATTACK_BONUS;
    }

    public String getAttackPowerInfo() {
        return "Siła ataku wynosi: " + totalAttack();
    }
}
