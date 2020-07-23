package ir.ac.kntu.cs2d;

public class Player {
    private int heart;
    private int money;
    private Colt colt;
    private boolean haveArmor;
    public Player(Colt colt){
        this.heart =100 ;
        this.money = 800;
        this.colt=colt;
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