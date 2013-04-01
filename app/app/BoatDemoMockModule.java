package app;

import com.google.inject.AbstractModule;

import de.htwg.seapal.boatdemo.controllers.IBoatController;
import de.htwg.seapal.boatdemo.models.IBoat;



public class BoatDemoMockModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IBoat.class).to(de.htwg.seapal.boatdemo.models.mock.Boat.class);
		bind(IBoatController.class).to(de.htwg.seapal.boatdemo.controllers.mock.BoatController.class);	
		
	}

}
