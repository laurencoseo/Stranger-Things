import java.util.Random;

public class Player {

    // Player attributes
    String type;
    int health;
    int attackDamage;
    int numHealthPotions;
    int healAmount;

    public Player(String type, int health, int attackDamage, int numHealthPotions, int healAmount) {
        this.type = type;
        this.health = health;
        this.attackDamage = attackDamage;
        this.numHealthPotions = numHealthPotions;
        this.healAmount = healAmount;
    }

    // Getters
    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getNumHealthPotions() {
        return numHealthPotions;
    }

    public int getHealAmount() {
        return healAmount;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setNumHealthPotions(int numHealthPotions) {
        this.numHealthPotions = numHealthPotions;
    }

    public void setHealAmount(int healAmount) {
        this.healAmount = healAmount;
    }

    @Override
    public String toString() {
        return "Player:" +
                "Name ='" + type + '\'' +
                ", health =" + health +
                ", attackDamage =" + attackDamage +
                ", numHealthPotions =" + numHealthPotions +
                ", healAmount =" + healAmount +
                '}';
    }

    public void attack() {
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers from 1 to 20 (20 sided die)
        int randNum = rand.nextInt(20) + 1;
    }

    public void heal() {
        setHealth(getHealth() + getHealAmount());
        setNumHealthPotions(getNumHealthPotions() - 1);
    }

    public void run() {
        System.out.println("Yes, it is ok to run with those odds.");
    }
}
