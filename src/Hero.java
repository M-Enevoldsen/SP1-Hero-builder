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


    public Hero(String newName, String newHeroClass) {
        name = newName;
        heroClass = newHeroClass;
        level = 5;
        healthPoints = 80;
        maxHealth = 100;
        gold = 10;
        xp = 600;
        isAlive = healthPoints > 0;
        inventory[0] = "Dagger";
        inventory[1] = "Smoke bomb";
        inventory[2] = "Rations";
        inventory[3] = null;
        inventory[4] = null;


    }

    public int attack() {
        int damage = 2 * level;
        return (damage);
    }

    public int monsterDamage(){
        int damage = (int) (Math.random() * 31);
        return (damage);
    }
}
