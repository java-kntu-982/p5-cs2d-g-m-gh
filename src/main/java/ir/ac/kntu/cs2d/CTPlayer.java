package ir.ac.kntu.cs2d;

public class CTPlayer extends ir.ac.kntu.cs2d.Player {
    private ir.ac.kntu.cs2d.Weapon weapon;
    public CTPlayer() {
        super(ir.ac.kntu.cs2d.Colt.USP);
    }

    public void setWeapon(ir.ac.kntu.cs2d.Weapon weapon) throws ir.ac.kntu.cs2d.InvalidWeaponException {
        if(weapon.equals(ir.ac.kntu.cs2d.Weapon.AK47) || weapon.equals(ir.ac.kntu.cs2d.Weapon.GALIL)){
            throw new ir.ac.kntu.cs2d.InvalidWeaponException("Invalid weapon!");
        }else {
            this.weapon = weapon;
        }
    }
}
