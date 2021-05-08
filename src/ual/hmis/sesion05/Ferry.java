package ual.hmis.sesion05;

import java.util.ArrayList;

public class Ferry {
	public int maxNumPas;
	public double maxPeso;
	public int maxVeh;
	public int numTotPas;
	public int numTotVeh;
	public double pesTotVeh;
	public ArrayList<Vehiculo> vehiculos;
	
	public Ferry (int maxNumPas, double maxPeso, int maxVeh) {
		this.maxNumPas = maxNumPas;
		this.maxPeso = maxPeso;
		this.maxVeh = maxVeh;
		this.numTotPas = 0;
		this.numTotVeh = 0;
		this.pesTotVeh = 0.0;
		this.vehiculos = new ArrayList<Vehiculo>();
	}
	
	public boolean embarcarVehiculo (Vehiculo v) {
		// Embarca un vehículo añadiéndolo a la lista
		this.numTotPas+= v.numPasajeros;
		this.numTotVeh++;
		this.pesTotVeh+= v.pesoCarga;
		if(superadoMaximoVehiculos()||superadoMaximoPeso()||numTotPas>maxNumPas) {
			this.numTotPas-= v.numPasajeros;
			this.numTotVeh--;
			this.pesTotVeh-= v.pesoCarga;
			return false;
		}
		this.vehiculos.add(v);
		return true;
	}
	
	public int totalVehiculos() {
		// devuelve el número total de vehículos embarcados
		return vehiculos.size();
	}
	
	public boolean vacio() {
		// verdadero si no hay ningún vehículo
		return totalVehiculos()==0;
	}
	
	public boolean superadoMaximoVehiculos() {
		 // verdadero si el número total de los vehículos supera el máximo
		return numTotVeh>maxVeh;
	}
	
	public boolean superadoMaximoPeso() {
		// verdadero si el peso total de los vehículos supera el máximo
		return pesTotVeh>maxPeso;
	}
	 
}
