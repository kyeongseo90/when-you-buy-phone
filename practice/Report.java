package practice;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Report {

    public void report(Writer out, List<Machine> machines, Robot robot) throws IOException {
        
    	printTitle(out);

        printMachineStatus(out, machines);

        // Robot
		printRobotStatus(out, robot);

		// Footer
        out.write("====================\n");
    }

	private static void printRobotStatus(Writer out, Robot robot) throws IOException {
		out.write("Robot");
		if (robot.getLocation() != null) {
			Machine machine = (Machine) robot.getLocation();
			out.write(" location=" + machine.getName());
		}
		if (robot.getBin() != null)
			out.write(" bin=" + robot.getBin());

		out.write("\n");
	}

	private void printTitle(Writer out) throws IOException {
		out.write("< FACTORY REPORT >\n");
	}

	private void printMachineStatus(Writer out, List<Machine> machines) throws IOException {
		Iterator<Machine> line = machines.iterator();
        while (line.hasNext()) {
			Machine machine = (Machine) line.next();
			out.write("Machine : " + machine.getName());

			if (machine.getBasket() != null) {
				out.write(" bin=" + machine.getBasket());
			}

            out.write("\n");
        }
        out.write("\n");
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		Writer out = new OutputStreamWriter(System.out);
		
		Machine machine1= new Machine("name1", "location1");
		Machine machine2= new Machine("name2", "location2");
		Machine machine3= new Machine("name3", "location3");
		
		machine1.put("basket1");
		machine2.put("basket2");
		machine3.put("basket3");
		
		List<Machine> machines = new ArrayList<Machine>();
		
		machines.add(machine1);
		machines.add(machine2);
		machines.add(machine3);
		
		
				
		Robot robot = new Robot();
		robot.moveTo(machine2);
		robot.pick();
		
		
		Report report = new Report();
		report.report(out, machines, robot);
		
		out.close();
		
		
	}

}