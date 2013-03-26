package controllers.impl;

import static org.junit.Assert.*;

import models.impl.Boat;

import org.junit.Before;
import org.junit.Test;

public class BoatControllerTest {

	private BoatController boatController;
	
	@Before
	public void setup(){
		boatController = new BoatController(new Boat()); 
	}

	@Test
	public void testGetBoatName() {
		boatController.setBoatName("Xpresso");
		assertEquals("Xpresso", boatController.getBoatName());
	}

}
