package controllers.mock;

import models.IBoat;

import com.google.inject.Inject;

import controllers.AbstractBoatController;

public class BoatController extends AbstractBoatController{

	@Inject
	public BoatController(IBoat boat) {
		this.boat = boat;
	}

}
