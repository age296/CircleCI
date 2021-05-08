package ual.hmis.sesion05;

import java.util.ArrayList;

public class Ejercicio9 {
	public ArrayList<String> listaCadenasOrdenadas(ArrayList<String> arr1, ArrayList<String> arr2) {
		ArrayList<String> result = new ArrayList<String>();
		
		for(String ss: arr2) {
			if(result.contains(ss)!=false) continue;
			result.add(ss);
		}
		
		for (String ss:arr1) {
			if(result.contains(ss)!=false) continue;
			result.add(ss);
		}
		
		result.sort(null);
		return result;
	}
}
