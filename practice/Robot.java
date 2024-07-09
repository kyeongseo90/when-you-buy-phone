package practice;

public class Robot {
    Machine location;
    String bin;

    public Robot() {}

    public Machine getLocation() {
    	return location;
    }
    
    public void moveTo(Machine location) {
    	this.location = location;
    }

    public void pick() {
    	this.bin = location.takeTrash();
    }
    
    public String getBin() {
    	return bin;
    }

    public void release() {
        location.put(bin);
        bin = null;
    }
}
