package de.htwg.seapal.boatdemo.controllers.mock;


import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.boatdemo.controllers.AbstractBoatController;
import de.htwg.seapal.boatdemo.models.IBoat;
import de.htwg.seapal.persondemo.controllers.IPersonController;

@Singleton
public class BoatController extends AbstractBoatController{

	@Inject
	public BoatController(IBoat boat, IPersonController personController) {
		this.boat = boat;
		this.personController = personController;
	}
	
	@Override
	public String getBoatOwnerName() {
		return personController.getPersonById(4711);
	}

}
