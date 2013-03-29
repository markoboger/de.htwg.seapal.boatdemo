package controllers;

import models.IBoat;
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
