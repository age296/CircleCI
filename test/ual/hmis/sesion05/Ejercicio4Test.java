package ual.hmis.sesion05;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio4Test {
	@CsvSource({
		"hola,adios,ao",
		"mar,amar,amar",
		",hola,",
		"hola,,"
	})
	
	@ParameterizedTest(name = "{index} => Con p1 ({0}) y p2 ({1}) sale {2}")
	void testCaracteres(String p1, String p2, String result) {
		// Arrange
		Ejercicio4 e4 = new Ejercicio4();
		// Act
		// Assert
		assertEquals(result, e4.caracteres(p1, p2));
	}
}
