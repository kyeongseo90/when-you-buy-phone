public class Person {
    private String name;
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
    public void self_introduction(){
        System.out.println("안녕하세요, 저는 "+name+"입니다.");
    }
}
