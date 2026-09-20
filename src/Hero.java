public class Hero {
    public String name;
    public String heroClass;
    public int level;
    public int healthPoints;
    public int maxHealth;
    public int gold;
    public int xp;
    public String[] inventory = new String[5];


    public Hero(String newName, String newHeroClass) {
        name = newName;
        heroClass = newHeroClass;
        level = 5;
        healthPoints = 80;
        maxHealth = calculateMaxHealth(level);
        gold = 10;
        xp = 600;
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

    public int monsterDamage() {
        int damage = (int) (Math.random() * 31);
        return (damage);
    }

    public int healAmount() {
        int heal = (int) (Math.random() * 11);
        return (heal);
    }

    public void takeDamage(int amount) {
        healthPoints -= amount;
        System.out.println(name + " takes " + amount + " damage");
        if (healthPoints > 0) {
            System.out.println(name + " is still standing");
            System.out.println(name + "'s health is now " + healthPoints);
            if (isHealthCritical()){
                System.out.println(name + "'s Health is critically low");
                System.out.println((int)getHealthPercentage() + "%HP");
            }
        } else {
            System.out.println(name + " is dead");
            System.out.println("GAME OVER");
        }
        Main.separationLine();
    }

    public void heal(int amount) {
        if (healthPoints <= 0) {
            healthPoints = 1;
            System.out.println(name + " has returned from the land of the dead and is back in the fight");
            System.out.println(name + "'s health is now " + healthPoints);
            System.out.println((int)getHealthPercentage() + "% HP");
        } else {
            System.out.println(name + " is healed for " + amount + " health");
            healthPoints = Math.min(healthPoints + amount, maxHealth);
            System.out.println(name + "'s health is now " + healthPoints);
            System.out.println((int)getHealthPercentage() + "% HP");
        }
        Main.separationLine();
    }

    public void addGold(int amount) {
        gold += amount;
        System.out.println(amount + " has been added to " + name + "'s coin sack they now have " + gold + " gold");
        Main.separationLine();
    }

    public boolean removeGold(int amount) {
        if (amount <= gold) {
            gold -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean buyItem(String itemName, int cost) {
        if (removeGold(cost)) {
            boolean placed = false;

            for (int i = 0; i < inventory.length; i++) {
                if (inventory[i] == null) {
                    inventory[i] = itemName;
                    System.out.println(itemName + " added to " + name + "'s inventory");
                    placed = true;
                    break;
                }
            }

            if (!placed) {
                //inventory was full todo:add player input for what items needs replaced
                System.out.println("inventory full! item replacement coming soon");
            }
            Main.separationLine();
            return true;
        } else {
            System.out.println(name + " does not have enough gold to purchase item");
            Main.separationLine();
            return false;
        }
    }

    public void addXp(int amount) {
        xp += amount;
        System.out.println(name + " gained " + amount + " XP");

        boolean leveledUp = false;

        while (xp > level * 100) {
            levelUp();
            leveledUp = true;
        }
        if (!leveledUp) {
            int xpNeededToLevelUp = level * 100 - xp;
            System.out.println(name + " needs " + xpNeededToLevelUp + " XP to level up");
            Main.separationLine();
        }
    }

    private void levelUp() {
        xp = xp - (level * 100);
        level++;
        maxHealth = calculateMaxHealth(level);
        int xpNeededForLevelUp = level * 100 - xp;
        System.out.println(name + " reached level " + level);
        System.out.println(xpNeededForLevelUp + " XP needed for next level up");
        System.out.println("Max Health is now " + maxHealth);
        Main.separationLine();
    }

    private int calculateMaxHealth(int currentLevel) {
        return currentLevel * 20;
    }

    public boolean isHealthCritical() {
        return healthPoints < maxHealth * 0.25;
    }

    public boolean isAlive(){
        return healthPoints > 0;
    }

    public double getHealthPercentage(){
        double healthPercent;
        healthPercent = (double) healthPoints / (double) maxHealth * 100;
        return healthPercent;
    }
    public void printInventory(){
        System.out.println("INVENTORY");
        int itemCount = 0;
        for (String item : inventory) {
            if (item == null) {
                System.out.println("-<Empty>");
                continue;
            }
            System.out.println("-" + item);
            itemCount++;
        }
        System.out.println(itemCount + "/5 inventory slots used");
    }
}
