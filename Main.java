public class Main {
    public static void main(String[] args) {
        Person jobs = new Person("잡스");
        Person jaedragon = new Person("재용");

        Smartphone iphone = new IPhone(jobs, Brand.APPLE);
        iphone.turnOn();

        GalaxyPhone galaxy = new GalaxyPhone(jaedragon, Brand.SAMSUNG);
        galaxy.turnOn();

    }
}
