package practice;

public class Machine {
    String name;
    String location;
    String basket;

    public Machine(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String takeTrash() {
        String trash = basket;
        basket = null;
        return trash;
    }

    public String getBasket() {
        return basket;
    }

    public void put(String bin) {
        this.basket = bin;
    }

    public String getName() {
        return name;
    }
}