package simpleGame.model;

 public class GameCharacter {

    private String name;
    private double attackPower;
    private double defencePower;
    private double health;

    public GameCharacter(String name, double attackPower, double defencePower, double health) {
        this.name = name;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
        this.health = health;

    }

    public double totalAttack(){
        return attackPower;
    }

    public double totalDefence(){
        return defencePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public double getDefencePower() {
        return defencePower;
    }

    public void setDefencePower(double defencePower) {
        this.defencePower = defencePower;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

}
