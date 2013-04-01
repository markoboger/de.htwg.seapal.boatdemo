package controllers.mock;

import models.IBoat;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import controllers.AbstractBoatController;

@Singleton
public class BoatController extends AbstractBoatController{

	@Inject
	public BoatController(IBoat boat) {
		this.boat = boat;
	}

}
