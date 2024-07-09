package practice;

import java.io.IOException;
import java.io.Writer;

public class Robot {
    Machine machine;
    String bin;

    public Robot() {}

    public Machine getMachine() {
    	return machine;
    }
    
    public void moveTo(Machine machine) {
    	this.machine = machine;
    }

    public void clear() {
    	this.bin = machine.clearBasket();
    }
    
    public String getBin() {
    	return bin;
    }

    public void release() {
        machine.put(bin);
        bin = null;
    }

    public void printStatus(Writer out) throws IOException {
        out.write("Robot");

        if (machine != null) {
            out.write(" location=" + machine.getName());
        }

        if (bin != null) {
            out.write(" bin=" + bin);
        }

        out.write("\n");
    }
}
