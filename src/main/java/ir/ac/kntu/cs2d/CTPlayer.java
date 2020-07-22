package ir.ac.kntu.cs2d;

public class CTPlayer extends Player {
    private Weapon weapon;
    public CTPlayer() {
        super(Colt.USP);
    }

    public void setWeapon(Weapon weapon) throws InvalidWeopen {
        if(weapon.equals(Weapon.AK47) || weapon.equals(Weapon.GALIL)){
            throw new InvalidWeopen("Invalid weapon!");
        }else {
            this.weapon = weapon;
        }
    }
}
