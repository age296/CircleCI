package ual.hmis.sesion05;

public class Ejercicio3 {
	public String asteriscos (int num) {
		String result = "";
		int p = num;
		if(p<0)
			return "número erróneo";
		if(p<5)
			p=5;
		if(p>12)
			p=12;
		for(int i=1;i<=p;i++) {
			result+="*";
		}
		return result;
	}
}
