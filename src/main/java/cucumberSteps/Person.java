package cucumberSteps;

public class Person {

    private Shield shield;
    private int hitPoints;
    private int maxHp;

    Person(Shield startingShield){
        this.maxHp = 1000;
        this.hitPoints = this.maxHp;
        this.shield = startingShield;
    }

    public void blockAttack(int attack){

        this.hitPoints -= this.shield.blockDamage(attack);
    }

    public boolean hasFullHp(){

        return (this.hitPoints == this.maxHp) ;
    }

    public Object getHp() {

        return this.hitPoints;
    }

    public String checkShieldStatus() {
        return this.shield.checkStatus();
    }
}
