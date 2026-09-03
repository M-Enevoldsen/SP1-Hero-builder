public class Main {
    //player 1
String player1Name;
int player1HealthPoints;
int player1MaxHealth;
int player1Level;
int player1XP;
int player1Gold;
boolean isAlivePlayer1;
String player1HeroClass;
String[] player1Inventory = new String[5];

    //player 2
String player2Name;
int player2HealthPoints;
int player2MaxHealth;
int player2Level;
int player2XP;
int player2Gold;
boolean isAlivePlayer2;
String player2HeroClass;
String[] player2Inventory = new String [5];

    void main(){

    player1Name = "John";
    player1HealthPoints = 100;
    player1MaxHealth = 100;
    player1Level = 5;
    player1XP = 0;
    player1Gold = 5;
    isAlivePlayer1 = true;
    player1HeroClass = "Assassin";
    player1Inventory[0] = "Dagger";
    player1Inventory[1] = "Smokebomb";
    player1Inventory[2] = "Heroes lunch";
    player1Inventory[3] = "Empty item slot";
    player1Inventory[4] = "Empty item slot";

    player2Name = "Pete";
    player2HealthPoints = 100;
    player2MaxHealth = 100;
    player2Level = 5;
    player2XP = 0;
    player2Gold = 5;
    isAlivePlayer2 = true;
    player2HeroClass = "Paladin";
    player2Inventory[0] = "Warhammer";
    player2Inventory[1] = "Holy Sigil";
    player2Inventory[2] = "Heroes lunch";
    player2Inventory[3] = "Empty item slot";
    player2Inventory[4] = "Empty item slot";

        System.out.println(" === CHARACTER SHEET === ");
        System.out.println("Name: " + player1Name);
        System.out.println("Class: " + player1HeroClass);
        System.out.println("Level: " + player1Level);
        System.out.println("Health: " + player1HealthPoints + "/" +  player1MaxHealth);
        System.out.println("XP: " + player1XP);
        System.out.println("Gold " + player1Gold);
        if (isAlivePlayer1 = true) {
            System.out.println("Alive");
        } else {
            System.out.println("Dead");
        }
        System.out.println("=== Player 1 ===");
        System.out.println("=== INVENTORY ===");
        if (player1Inventory[0] != "Empty item slot"){
            System.out.println(player1Inventory[0]);
        }
        if (player1Inventory[1] != "Empty item slot"){
            System.out.println(player1Inventory[1]);
        }
        if (player1Inventory[2] != "Empty item slot"){
            System.out.println(player1Inventory[2]);
        }
        if (player1Inventory[3] != "Empty item slot"){
            System.out.println(player1Inventory[3]);
        }
        if (player1Inventory[4] != "Empty item slot"){
            System.out.println(player1Inventory[4]);
        }

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("=== Player 2 ===");
        System.out.println("=== CHARACTER SHEET ===");
        System.out.println("Name: " + player2Name);
        System.out.println("Class: " + player2HeroClass);
        System.out.println("Level: " + player2Level);
        System.out.println("Health: " + player2HealthPoints + "/" + player2MaxHealth);
        System.out.println("XP: " + player2XP);
        System.out.println("Gold: " + player2Gold);
        if (isAlivePlayer2 = true) {
            System.out.println("Alive");
        } else {
            System.out.println("Dead");
        }
        System.out.println("=== INVENTORY ===");
        if (player2Inventory[0] != "Empty item slot"){
            System.out.println(player2Inventory[0]);
        }
        if (player2Inventory[1] != "Empty item slot"){
            System.out.println(player2Inventory[1]);
        }
        if (player2Inventory[2] != "Empty item slot"){
            System.out.println(player2Inventory[2]);
        }
        if (player2Inventory[3] != "Empty item slot"){
            System.out.println(player2Inventory[3]);
        }
        if (player2Inventory[4] != "Empty item slot"){
            System.out.println(player2Inventory[4]);
        }













    }



}