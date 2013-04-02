package de.htwg.seapal.boatdemo.views.tui;

import java.util.Scanner;

import com.google.inject.Inject;

import de.htwg.seapal.boatdemo.controllers.IBoatController;
import de.htwg.util.observer.Event;
import de.htwg.util.observer.IObserver;
import de.htwg.util.plugin.Plugin;


public class BoatTUI implements Plugin, IObserver{
	
	private IBoatController controller;

	@Inject
	public BoatTUI(IBoatController controller) {
		this.controller = controller;
		controller.addObserver(this);
	}

	public void update(Event e) {
		printTUI();
	}

	public boolean processInputLine(String line) {
		boolean continu = true;
		if (line.equalsIgnoreCase("q")) {
			continu = false;
		}
		if (line.equalsIgnoreCase("n")) {
			System.out.println("New Boat Name:");
			Scanner scanner = new Scanner(System.in);
			controller.setBoatName(scanner.next());
		}
		return continu;
	}
	
	public void printTUI() {
		System.out.println("BoatDemo: n - new Name");
		System.out.println(controller.getString());	
	}

	@Override
	public String getMenuEntry() {
		return "b - Boat";
	}

	@Override
	public String getMenuKey() {
		return "b";
	}

}
