public abstract class Smartphone {
    private String brand;
    private String model;
    private double storage;
    private double ram;
    private int volume;
    private boolean power;

    public Smartphone(Brand brand) {
        this.brand = brand.getKor();
    }

    public int increaseVolume() {
        if (power && 0 <= volume && volume <= 100) {
            volume++;
        }
        return volume;
    }

    public abstract void printTurnOnProcess(String comment);

    public String getBrand(){
        return brand;
    }

    public void turnOn(){
        printTurnOnProcess("폰 켜지는 중");
    }


    public void turnOff(){
        System.out.println("띠로리로");
    }

}
