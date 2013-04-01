package de.htwg.seapal.boatdemo.controllers.mock;


import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.boatdemo.controllers.AbstractBoatController;
import de.htwg.seapal.boatdemo.models.IBoat;

@Singleton
public class BoatController extends AbstractBoatController{

	@Inject
	public BoatController(IBoat boat) {
		this.boat = boat;
	}

}
