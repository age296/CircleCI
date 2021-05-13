package ual.hmis.sesion05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio1Test {
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"2, 1",
				"10, 1",
				"6, 1",
				"14, 7"})
	
	void testTransformar(int input, int expected) {
		Ejercicio1 prueba = new Ejercicio1();
		assertEquals(expected, prueba.transformar(input));
	}
}
