public class Farmer extends BaseCharacter {

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower) {
        super(name, strength, health, stamina, speed, attackPower);
    }

    private void plow(){
        System.out.println("Farmer.plow() called");
    }

    private void harvest(){
        System.out.println("Farmer.harvest() called");
    }


}
