package de.htwg.seapal.boatdemo.controllers.mock;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;


import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.boatdemo.app.BoatDemoMockModule;
import de.htwg.seapal.boatdemo.controllers.IBoatController;

public class BoatControllerTest {

	private IBoatController boatController;
	// Set up Google Guice Dependency Injector
	Injector injector = Guice.createInjector(new BoatDemoMockModule());

	
	@Before
	public void setup(){
		// Build up the application, resolving dependencies automatically by Guice
		boatController = injector.getInstance(IBoatController.class);
	}

	@Test
	public void testGetBoatName() {
		boatController.setBoatName("BullshitName-ShouldNotShowUp");
		assertEquals("Titanic", boatController.getBoatName());
	}
	
	@Test
	public void testGetOwnerName() {	
		assertEquals("Mustermann", boatController.getBoatOwnerName());
	}

}
