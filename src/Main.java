public class Main {

    void main() {

        Hero player1 = new Hero("john");
        Hero player2 = new Hero("Bob");
        System.out.println("PLAYER 1");
        System.out.println("=== CHARACTER SHEET ===");
        System.out.println("Name: " + player1.name);
        System.out.println("Class: " + player1.heroClass);
        System.out.println("Level " + player1.level);
        System.out.println("Health " + player1.healthPoints + "/" + player1.maxHealth);
        System.out.println("XP: " + player1.xp);
        System.out.println("Gold: " + player1.gold);
        if (player1.isAlive) {
            System.out.println("Alive");
        } else {
            System.out.println("Dead");
        }
        System.out.println(" ");
        System.out.println("INVENTORY");
        System.out.println("-" + player1.inventory[0]);
        System.out.println("-" + player1.inventory[1]);
        System.out.println("-" + player1.inventory[2]);
        System.out.println("-" + player1.inventory[3]);
        System.out.println("-" + player1.inventory[4]);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("PLAYER 2");
        System.out.println("=== CHARACTER SHEET ===");
        System.out.println("Name: " + player2.name);
        System.out.println("Class: " + player2.heroClass);
        System.out.println("Level " + player2.level);
        System.out.println("Health " + player2.healthPoints + "/" + player1.maxHealth);
        System.out.println("XP: " + player2.xp);
        System.out.println("Gold: " + player2.gold);
        if (player2.isAlive) {
            System.out.println("Alive");
        } else {
            System.out.println("Dead");
        }
        System.out.println(" ");
        System.out.println("INVENTORY");
        System.out.println("-" + player2.inventory[0]);
        System.out.println("-" + player2.inventory[1]);
        System.out.println("-" + player2.inventory[2]);
        System.out.println("-" + player2.inventory[3]);
        System.out.println("-" + player2.inventory[4]);
    }


}