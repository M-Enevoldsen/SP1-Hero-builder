public class Hero {
    public String name;
    public String heroClass;
    public int level;
    public int healthPoints;
    public int maxHealth;
    public int gold;
    public int xp;
    public boolean isAlive;
    public String[] inventory = new String[5];


    public Hero(String newName) {
        name = newName;
        heroClass = "Assassin";
        level = 5;
        healthPoints = 100;
        maxHealth = 100;
        gold = 10;
        xp = 100;
        isAlive = true;
        inventory[0] = "Dagger";
        inventory[1] = "Smoke bomb";
        inventory[2] = "Rations";
        inventory[3] = " ";
        inventory[4] = " ";


    }

    public int attack() {
        int damage = 2 * level;
        return damage;
    }
}
