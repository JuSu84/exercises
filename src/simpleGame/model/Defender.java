package simpleGame.model;

 public class Defender extends GameCharacter {


    private static final double DEFENCE_BONUS = 1.2;

    public Defender(String name, double attackPower, double defencePower, double health) {
        super(name, attackPower, defencePower, health);
    }

    @Override
    public double totalDefence() {
        return getDefencePower() * DEFENCE_BONUS;
    }

    public String getDefencePowerInfo() {
        return "Siła obrony wynosi: " + totalDefence();
    }
}
