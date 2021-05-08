package ual.hmis.sesion05;

public class Ejercicio4 {
	public String caracteres (String p1, String p2) {
		if(p1==null || p2==null)
			return null;
		String result="";
		for(int i=0;i<=p1.length();i++) {
			if(p1.indexOf(p2.charAt(i))!=-1)
				result+=p2.charAt(i);
		}
		return result;
	}
}
