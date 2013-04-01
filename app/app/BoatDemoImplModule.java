package app;

import com.google.inject.AbstractModule;

import de.htwg.seapal.boatdemo.controllers.IBoatController;
import de.htwg.seapal.boatdemo.models.IBoat;



public class BoatDemoImplModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IBoat.class).to(de.htwg.seapal.boatdemo.models.impl.Boat.class);
		bind(IBoatController.class).to(de.htwg.seapal.boatdemo.controllers.impl.BoatController.class);	
		
	}

}
