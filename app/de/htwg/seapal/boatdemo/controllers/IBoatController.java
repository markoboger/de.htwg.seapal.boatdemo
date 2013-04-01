package de.htwg.seapal.boatdemo.controllers;

import de.htwg.util.observer.IObservable;

public interface IBoatController extends IObservable{

	void setBoatName(String string);
	
	String getBoatName();

	String getString();

}
