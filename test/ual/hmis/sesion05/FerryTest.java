package ual.hmis.sesion05;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FerryTest {
	Ferry f= new Ferry(4,1000,1);
	
	@CsvSource({
		"3,4,900.0,4,1000.0,1,true",
		"4,4,1000.0,4,1000.0,1,true",
		"4,4,1000.1,4,1000.0,1,false",
		"1,2,1200.0,4,1000.0,1,false",
		"5,4,500.0,4,1000.0,1,false",
		"1,2,1200.0,4,1000.0,0,false",
	})
	
	@ParameterizedTest(name = "{index} => Con vehiculo de ({0}) pasajeros, ({1}) ruedas y de ({2}) Kg para un Ferry de ({3}) personas, peso maximo de ({4}) y vehiculos maximos ({5}) que embarque es {6}")
	void testFerry(int pas, int rued, double pes, int pasMax, double pesMax, int vehMax, String result) {
		// Arrange
		Ferry f= new Ferry(pasMax,pesMax,vehMax);
		// Act
		// Assert
		assertEquals(Boolean.parseBoolean(result), f.embarcarVehiculo(new Vehiculo(pas,rued,pes)));
		if(Boolean.parseBoolean(result))
			assertFalse(f.vacio());
		else 
			assertTrue(f.vacio());
	}
}
