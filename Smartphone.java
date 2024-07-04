public abstract class Smartphone {
    private Person owner;
    private String brand;
    private String model;
    private double storage;
    private double ram;
    private int volume;
    private boolean power;

    public Smartphone(Person owner, Brand brand) {
        this.owner = owner;
        this.brand = brand.getKor();
    }

    public void buy(){
        System.out.println(owner.getName()+"님이 "+model+"폰을 구매했습니다.");
    }

    public int increaseVolume() {
        if (power && 0 <= volume && volume <= 100) {
            volume++;
        }
        return volume;
    }

    public abstract void printTurnOnProcess(String comment);

    public void turnOn(){
        System.out.println(owner.getName()+"님이 "+model+"폰을 켰습니다.");
        printTurnOnProcess("폰 켜지는 중");
    }


    public void turnOff(){
        System.out.println("띠로리로");
    }

}
