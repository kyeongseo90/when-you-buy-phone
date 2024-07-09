package practice;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Report {

    public void printFactory(Writer out, List<Machine> machines, Robot robot) throws IOException {
        
    	printTitle(out);

		for (Machine machine : machines) {
			machine.printStatus(out);
			out.write("\n");
		}

		robot.printStatus(out);

		printFooter(out);
    }

	private void printTitle(Writer out) throws IOException {
		out.write("< FACTORY REPORT >\n");
	}

	private void printFooter(Writer out) throws IOException {
		out.write("====================\n");
	}

}