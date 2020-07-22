package ir.ac.kntu.cs2d;

public class TPlayer extends Player{
    private Weapon weapon;
    public TPlayer() {
        super(Colt.GLOCK);
    }

    public void setWeapon(Weapon weapon) throws InvalidWeopen {
        if(weapon.equals(Weapon.M4A1) || weapon.equals(Weapon.FAMAS)){
            throw new InvalidWeopen("Invalid weapon!");
        }
        this.weapon = weapon;
    }
}
