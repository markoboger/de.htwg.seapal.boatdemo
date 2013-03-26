package controllers.mock;

import static org.junit.Assert.*;

import models.mock.Boat;

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
		boatController.setBoatName("BullshitName-ShouldNotShowUp");
		assertEquals("Titanic", boatController.getBoatName());
	}

}
