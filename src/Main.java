public class Main {
    Hero player1;
    Hero player2;

    void main() {

        player1 = new Hero("john", "Assassin");
        player2 = new Hero("Bob", "Warrior");
        printCharacterSheet(player1, 1);
        System.out.println(" ");
        System.out.println(" ");
        printCharacterSheet(player2, 2);
        System.out.println("========COMBAT===========");
        player1.takeDamage(player1.monsterDamage());
        player2.takeDamage(player2.monsterDamage());
        player1.heal(player1.healAmount());
        player2.heal(player2.healAmount());
        player1.addGold(40);
        player2.addGold(25);
        player1.buyItem("Dragull's Blade", 42);
        player2.buyItem("Healing Potion", 20);
        player2.buyItem("Aegis of Immortality", 1000);
        player1.addXp(100);
        player2.addXp(1150);
        player2.pvp(player1);
    }


    void printCharacterSheet(Hero hero, int playerNumber) {
        System.out.println("Player: " + playerNumber);
        System.out.println("=== CHARACTER SHEET ===");
        System.out.println("Name: " + hero.name);
        switch (hero.heroClass) {
            case "Assassin":
                System.out.println("Class: " + "A" + " " + "(Assassin)");
                break;
            case "Warrior":
                System.out.println("Class: " + "W" + " " + "(Warrior)");
                break;
            default:
                System.out.println("Hero Class not Available");

        }
        System.out.println("Level " + hero.level);
        System.out.println("Health " + hero.healthPoints + "/" + hero.maxHealth);
        System.out.println((int) hero.getHealthPercentage() + "% HP");
        System.out.println("XP: " + hero.xp);
        if (hero.xp > hero.level * 100) {
            System.out.println("Ready to level up!");
        }
        System.out.println("Gold: " + hero.gold);

        if (hero.isAlive()) {
            System.out.println("Alive");
        } else {
            System.out.println("Dead");
        }
        if (hero.isHealthCritical()) {
            System.out.println("HEALTH CRITICAL!");
        }
        System.out.println(" ");
        hero.printInventory();
        separationLine();
    }

    public static void separationLine(){
        System.out.println("=========================");
    }


}

