import java.util.Scanner;

import views.tui.BoatTUI;
import controllers.impl.BoatController;
import models.IBoat;
import models.impl.Boat;

public class BoatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IBoat boat = new Boat();
		BoatController controller = new BoatController(boat);
		BoatTUI tui = new BoatTUI(controller);

		tui.printTUI();
		// continue to read user input on the tui until the user decides to quit
		boolean continu = true;
		Scanner scanner = new Scanner(System.in);
		while (continu) {
			continu = tui.processInputLine(scanner.next());
		}

	}

}
