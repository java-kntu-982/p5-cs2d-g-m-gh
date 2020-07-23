package ir.ac.kntu.cs2d;

public enum Weapon {
    MP5("MP5",1500,13,120,3.1,30),
    P90("P90",2350,11,80,3.3,50),
    AK47("AK 47",2500,22,120,2.5,30),
    M4A1("M4A1",3100,22,120,3.1,30),
    GALIL("Galil",2000,13,120,2.6,35),
    FAMAS("Famas",2250,14,120,3.3,25),
    //COLTS
    GLOCK("Glock",400,21,300,2.3,20),
    USP("USP",500,24,340,2.2,12),
    DEAGLE("Deagle",650,34,550,2.2,7),
    ;

    Weapon(String name, int price, int damage, int timeToNextFire, double secondsToReload, int magazineCapacity) {
        this.name = name;
        this.price = price;
        this.damage = damage;
        this.timeToNextFire = timeToNextFire;
        this.secondsToReload = secondsToReload;
        this.magazineCapacity = magazineCapacity;
    }

    private String name;
    private int price;
    private int damage;
    private int timeToNextFire;
    private double secondsToReload;
    private int magazineCapacity;


}
