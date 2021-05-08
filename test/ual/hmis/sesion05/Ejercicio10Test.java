package ual.hmis.sesion05;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio10Test {
	@CsvSource({
		",0",
		"-5,-5",
		"+300,300",
		"500,500",
		"-20,-20",
		"32767,32767",
		"2 3 5, 0",
		"32768,0",
		"B3,0",
		"3.5,0",
		"-32769,0"
	})
	
	@ParameterizedTest(name = "{index} => Con cadena ({0}) sale {1}")
	void testCadenaEntero(String dig, String result) {
		// Arrange
		Ejercicio10 e10 = new Ejercicio10();
		// Act
		// Assert
		assertEquals(Integer.parseInt(result), e10.convertirCadenaEntero(dig));
	}
}
