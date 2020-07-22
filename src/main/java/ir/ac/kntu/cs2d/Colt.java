package ir.ac.kntu.cs2d;

public enum Colt {
    GLOCK("Glock",400,21,300,2.3,20),
    USP("USP",500,24,340,2.2,12),
    DEAGLE("Deagle",650,34,550,2.2,7),
    ;

    Colt(String name, int price, int damage, int timeToNextFire, double secondsToReload, int magazineCapacity) {
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
