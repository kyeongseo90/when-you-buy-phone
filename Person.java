public class Person {
    private String name;
    private Smartphone phone;
    private int age;
    private int weight;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public void buyPhone(Smartphone phone){
        this.phone = phone;
        System.out.println(name+"님이 "+phone.getBrand()+"폰을 구매했습니다.");
    }

    public void turnOnPhone(){
        System.out.println(name+"님이 "+phone.getBrand()+"폰을 켰습니다.");
        phone.turnOn();
    }

    public void self_introduction(){
        System.out.println("안녕하세요, 저는 "+name+"입니다.");
    }
}
