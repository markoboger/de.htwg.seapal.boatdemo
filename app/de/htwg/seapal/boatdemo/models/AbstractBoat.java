package de.htwg.seapal.boatdemo.models;

import de.htwg.seapal.boatdemo.models.IBoat;

public abstract class AbstractBoat implements IBoat{

	protected String name="n.a.";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
