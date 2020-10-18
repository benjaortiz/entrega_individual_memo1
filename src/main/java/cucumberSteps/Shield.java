package cucumberSteps;

public class Shield {

    private int defenseStat;
    String status;

    Shield(int defense){
        this.defenseStat = defense;
        this.status = "Fine";
    }

    public int blockDamage(int damage){

        int damageTaken = 0;

        if ( damage > this.defenseStat){
            damageTaken = damage - defenseStat;
        }

        int breakability = this.defenseStat*2;

        if(damage >= breakability ){
            this.status = "Broken";
        }

        return damageTaken;
    }

    public String checkStatus() {
        return this.status;
    }
}
