package de.htwg.seapal.boatdemo.controllers;

import de.htwg.seapal.boatdemo.controllers.IBoatController;
import de.htwg.seapal.boatdemo.models.IBoat;
import util.observer.Observable;

public abstract class AbstractBoatController extends Observable implements IBoatController{
	
	protected IBoat boat;

	@Override
	public void setBoatName(String string) {
		boat.setName(string);
		notifyObservers();
	}
	
	@Override
	public String getString() {
		return "Boat: " + boat.getName();
	}

	@Override
	public String getBoatName() {
		return boat.getName();
	}

}
