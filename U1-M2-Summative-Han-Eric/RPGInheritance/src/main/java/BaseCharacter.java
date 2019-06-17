public class BaseCharacter {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    public BaseCharacter(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    // create the "universal methods that all characters can do"
    public void run(){
        System.out.println("Run");
    }

    public void attack(){
        System.out.println("Attack");
    }

    public void heal(){
        System.out.println("Heal");
    }

    public void decreaseHealth(){
        System.out.println("Decrease health");
    }

    public void increaseStamina(){
        System.out.println("Increase stamina");
    }

    public void decreaseStamina(){
        System.out.println("Decrease Stamina");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
