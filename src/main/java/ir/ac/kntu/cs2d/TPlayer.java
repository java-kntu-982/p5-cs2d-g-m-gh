package ir.ac.kntu.cs2d;

public class TPlayer extends Player{
    private Weapon weapon;
    public TPlayer() {
        super(Weapon.GLOCK);
    }

    public void setWeapon(Weapon weapon) throws InvalidWeaponException {
        if(weapon.equals(Weapon.M4A1) || weapon.equals(Weapon.FAMAS)){
            throw new InvalidWeaponException("Invalid weapon!");
        }
        this.weapon = weapon;
    }
}
