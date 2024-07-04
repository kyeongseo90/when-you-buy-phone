public class Main {
    public static void main(String[] args) {

        Smartphone iphone = new IPhone();
        GalaxyPhone galaxy = new GalaxyPhone();

        Person jobs = new Person("잡스");
        jobs.buyPhone(iphone);
        jobs.turnOnPhone();

        Person jaedragon = new Person("재용");
        jaedragon.buyPhone(galaxy);
        jaedragon.turnOnPhone();

    }
}
