package de.htwg.seapal.boatdemo.controllers;

import de.htwg.seapal.boatdemo.controllers.IBoatController;
import de.htwg.seapal.boatdemo.models.IBoat;
import de.htwg.seapal.persondemo.controllers.IPersonController;
import de.htwg.util.observer.Observable;

public abstract class AbstractBoatController extends Observable implements IBoatController{
	
	protected IBoat boat;
	protected int boatOwnerId;
	protected IPersonController personController;

	@Override
	public String getBoatName() {
		return boat.getName();
	}
	
	@Override
	public void setBoatName(String string) {
		boat.setName(string);
		notifyObservers();
	}
	
	@Override
	public String getBoatOwnerName() {
		return personController.getPersonById(boatOwnerId);
	}
	
	@Override
	public String getString() {
		return "Boat: " + boat.getName();
	}


}
