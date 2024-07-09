package practice;

import java.io.IOException;
import java.io.Writer;

public class Machine {
    String name;
    String location;
    String basket;

    public Machine(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String clearBasket() {
        String trash = basket;
        basket = null;
        return trash;
    }

    public String getBasket() {
        return basket;
    }

    public void put(String basket) {
        this.basket = basket;
    }

    public String getName() {
        return name;
    }

    public void printStatus(Writer out) throws IOException {
        out.write("Machine : " + name);

        if (basket != null) {
            out.write(" bin=" + basket);
        }

        out.write("\n");
    }
}