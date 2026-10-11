public class Character {

    private final int maxHealth;
    private int health;

    // Constructor fixes max health and starts character at full health
    public Character(int maxHealth) {
        if (maxHealth <= 0) {
            this.maxHealth = 100; // sensible default
        } else {
            this.maxHealth = maxHealth;
        }
        this.health = this.maxHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    // Read-only getter for current health; no direct setter
    public int getHealth() {
        return health;
    }

    // Reduces health, floored at 0
    public void takeDamage(int amount) {
        if (amount <= 0) {
            System.out.println("Damage rejected: must be positive.");
            return;
        }

        health = Math.max(0, health - amount);
        System.out.println("takeDamage(" + amount + ") -> health = " + health + (health == 0 ? " (floored)" : ""));
    }

    // Restores health, capped at maxHealth
    public void heal(int amount) {
        if (amount <= 0) {
            System.out.println("Heal rejected: must be positive.");
            return;
        }

        health = Math.min(maxHealth, health + amount);
        System.out.println("heal(" + amount + ") -> health = " + health + (health == maxHealth ? " (capped)" : ""));
    }

    public static void main(String[] args) {
        System.out.println("--- Health Bar Demo ---");
        Character c = new Character(100);

        c.takeDamage(30);
        c.heal(50);
        c.takeDamage(150);

        System.out.println("Final character health: " + c.getHealth() + " / " + c.getMaxHealth());
    }
}
