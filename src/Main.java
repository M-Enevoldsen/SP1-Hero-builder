public class Main {

    void main() {

        Hero player1 = new Hero("john", "Assassin");
        Hero player2 = new Hero("Bob", "Warrior");
        System.out.println("PLAYER 1");
        System.out.println("=== CHARACTER SHEET ===");
        System.out.println("Name: " + player1.name);
        switch (player1.heroClass) {
            case "Assassin":
                System.out.println("Class: " + "A" + " " + "(Assassin)");
                break;
            case "Warrior":
                System.out.println("Class: " + "W" + " " + "(Warrior)");
                break;
            default:
                System.out.println("Hero Class not Available");

        }
        System.out.println("Level " + player1.level);
        System.out.println("Health " + player1.healthPoints + "/" + player1.maxHealth);
        System.out.println("XP: " + player1.xp);
        if (player1.xp > player1.level * 100) {
            System.out.println("Ready to level up!");
        }
        System.out.println("Gold: " + player1.gold);

        if (player1.isAlive) {
            System.out.println("Alive");
        } else {
            System.out.println("Dead");
        }
        if (player1.healthPoints < player1.maxHealth * 0.25) {
            System.out.println("HEALTH CRITICAL!");
        }
        System.out.println(" ");
        System.out.println("INVENTORY");
        for (String item : player1.inventory) {
            if (item == null) {
                System.out.println("-<Empty>");
                continue;
            }
            System.out.println("-" + item);
        }


        System.out.println(" ");
        System.out.println(" ");

        System.out.println("PLAYER 2");
        System.out.println("=== CHARACTER SHEET ===");
        System.out.println("Name: " + player2.name);
        switch (player2.heroClass) {
            case "Assassin":
                System.out.println("Class: " + "A" + " " + "(Assassin)");
                break;
            case "Warrior":
                System.out.println("Class: " + "W" + " " + "(Warrior)");
                break;
            default:
                System.out.println("Hero Class not Available");
        }
        System.out.println("Level " + player2.level);
        System.out.println("Health " + player2.healthPoints + "/" + player1.maxHealth);
        System.out.println("XP: " + player2.xp);
        if (player2.xp > player2.level * 100) {
            System.out.println("Ready to level up!");
        }
        System.out.println("Gold: " + player2.gold);
        if (player2.isAlive) {
            System.out.println("Alive");
        } else {
            System.out.println("Dead");
        }
        if (player2.healthPoints < player2.maxHealth * 0.25) {
            System.out.println("HEALTH CRITICAL!");
        }
        System.out.println(" ");
        System.out.println("INVENTORY");
        for (String item : player2.inventory) {
            if (item == null) {
                System.out.println("-<Empty>");
                continue;
            }
            System.out.println("-" + item);

        }
        System.out.println("=========================");
        System.out.println("========COMBAT===========");
        int incomingDamage = player1.monsterDamage();
        System.out.println("you take " + incomingDamage + " damage");
        player1.healthPoints -= incomingDamage;

        if (player1.healthPoints > 0) {
            System.out.println("you are still standing");
            System.out.println("your new health is now " + player1.healthPoints);
            ;
        } else {
            System.out.println("you are dead");
            System.out.println("GAME OVER");
        }


    }

}

