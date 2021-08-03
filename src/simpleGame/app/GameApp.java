package simpleGame.app;


import simpleGame.BattleSimulator;
import simpleGame.Team;
import simpleGame.model.Attacker;
import simpleGame.model.Defender;

 class GameApp {

    public static void main(String[] args) {
        Attacker character1 = new Attacker("Jan", 100, 100, 100);
        Attacker character2 = new Attacker("Pawel", 100, 100, 100);
        Attacker character3 = new Attacker("Artur", 110, 100, 100);
        Attacker character4 = new Attacker("Asia", 100, 100, 100);
        Defender character5 = new Defender("Iza", 100, 100, 100);
        Defender character6 = new Defender("Wojtek", 100, 100, 100);

        Team team1 = new Team("Team 1", character1, character2, character5);
        Team team2 = new Team("Team 2", character3, character4, character6);
        BattleSimulator.fight(team1, team2);

        System.out.println(team2.teamAttack());

    }
}
