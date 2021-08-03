package simpleGame;

import simpleGame.model.GameCharacter;

 public class Team {

    private final static int MAX_NUMBERS_OF_CHARACTER = 3;
    private String name;

    private GameCharacter[] characters = new GameCharacter[MAX_NUMBERS_OF_CHARACTER];

    public Team(String name, GameCharacter character1, GameCharacter character2, GameCharacter character3) {
        this.name = name;
        this.characters[0] = character1;
        this.characters[1] = character2;
        this.characters[2] = character3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameCharacter[] getCharacters() {
        return characters;
    }

    public void setCharacters(GameCharacter[] characters) {
        this.characters = characters;
    }

    public double teamDefence() {
        double defence = 0;
        for (GameCharacter character : characters) {
            defence += character.totalDefence();
        }
        return defence;
    }

    public double teamAttack() {
        double attack = 0;
        for (GameCharacter character : characters) {
            attack += character.totalAttack();
        }
        return attack;
    }

    double teamHealth() {
        double health = 0;
        for (GameCharacter character : characters) {
            health += character.getHealth();
        }
        return health;
    }
}
