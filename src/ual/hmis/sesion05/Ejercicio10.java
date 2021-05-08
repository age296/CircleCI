package ual.hmis.sesion05;

public class Ejercicio10 {
	public int convertirCadenaEntero(String dig) {
		try {
			Integer num=Integer.parseInt(dig);
			return num<=32767 && num>=-32768?num:0;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			return 0;
		}
	}
}
