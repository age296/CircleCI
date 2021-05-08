package ual.hmis.sesion05;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Ejercicio9Test {
	
//	static Stream<Arguments> crearCadenas(){
//		return Arrays.asList(new String[][][] {
//			{{},{"hola","adios"},{}},
//			{{"hola","adios"},{},{}},
//			{{"hola","adios"},{"hola","adios"},{"adios","hola"}},
//			{{"hola","adios"},{"hola","adios","chao"},{"adios","chao","hola"}},
//		});
//	}
	static Stream<Arguments> crearCadenas(){
		return Stream.of(
                Arguments.of(new ArrayList<String>(Arrays.asList()), 
                		new ArrayList<String>(Arrays.asList("hola","adios")),
                		new ArrayList<String>(Arrays.asList("adios","hola"))),
                
                Arguments.of(new ArrayList<String>(Arrays.asList("hola","adios")), 
                		new ArrayList<String>(Arrays.asList()),
                		new ArrayList<String>(Arrays.asList("adios","hola"))),
                
                Arguments.of(new ArrayList<String>(Arrays.asList("hola","adios")), 
                		new ArrayList<String>(Arrays.asList("hola","adios")),
                		new ArrayList<String>(Arrays.asList("adios","hola"))),
                
                Arguments.of(new ArrayList<String>(Arrays.asList("hola","adios")), 
                		new ArrayList<String>(Arrays.asList("hola","adios","adios")),
                		new ArrayList<String>(Arrays.asList("adios","hola"))),
                
                Arguments.of(new ArrayList<String>(Arrays.asList("hola","adios")), 
                		new ArrayList<String>(Arrays.asList("hola","adios","chao")),
                		new ArrayList<String>(Arrays.asList("adios","chao","hola")))
            
                );
	}
	
	@ParameterizedTest(name = "{index} => Con arr1 ({0}) y arr2 ({1}) sale {2}")
	@MethodSource("crearCadenas")
	void testLogin_parametrized(ArrayList<String> arr1, ArrayList<String> arr2, ArrayList<String> result) {
		// Arrange
		Ejercicio9 e9 = new Ejercicio9();
		// Act
		// Assert
		assertEquals(result, e9.listaCadenasOrdenadas(arr1, arr2));
	}
}
