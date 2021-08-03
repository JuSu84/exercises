package simpleGame;

 public class BattleSimulator {

    public static void fight(Team team1, Team team2) {
        double team1Health = attack(team2, team1);
        double team2Health = attack(team1, team2);
        double healthDiff = team1Health - team2Health;
        if (healthDiff > 0) {
            System.out.println("Wygrywa drużyna "+ team1.getName() + " z przewagą " + healthDiff + " zdrowia");
        }else if (healthDiff < 0 ){
            System.out.println("Wygrywa drużyna "+ team2.getName() + " z przewagą " + (-healthDiff) + " zdrowia");
        }else {
            System.out.println("Remis obie drużyny zachowały " + team1Health + " zdrowia");
        }
    }

    private static double attack(Team attacker, Team defender) {
        double attack = attacker.teamAttack();
        double defence = defender.teamDefence();
        double attackPower = attack - defence;
        double health = defender.teamHealth();
        if (attackPower > 0) {
            return health - attackPower;
        } else {
            return health;
        }
    }
}
