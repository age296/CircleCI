package ual.hmis.sesion05;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio3Test {
	@CsvSource({
		"-1,número erróneo",
		"0,*****",
		"6,******",
		"13,************"
	})
	
	@ParameterizedTest(name = "{index} => Con número ({0}) sale {1}")
	void testAsteriscos(int num, String result) {
		// Arrange
		Ejercicio3 e3 = new Ejercicio3();
		// Act
		// Assert
		assertEquals(result, e3.asteriscos(num));
	}
}
