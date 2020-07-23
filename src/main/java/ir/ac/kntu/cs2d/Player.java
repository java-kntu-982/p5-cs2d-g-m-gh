package ir.ac.kntu.cs2d;

public class Player {
    private int heart=100;
    private int money=800;
    private Weapon weapon;
    private boolean haveArmor;
    public Player(Weapon weapon){
        this.weapon=weapon;
    }

    public void setHaveArmor(boolean haveArmor) {
        if(haveArmor==true){
            this.heart+=80;
            this.money-=1000;
        }
        this.haveArmor = haveArmor;
    }

    public void setHeart(int heart) {
        this.heart = heart;
    }
}