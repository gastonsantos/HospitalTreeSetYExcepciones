package ar.edu.unlam.pb2;

public class CantidadSuperadaPacientesEnHospital extends Exception {

	public CantidadSuperadaPacientesEnHospital(){
		super("No se puede agregar, TOPE LLENO");
	}
	
}
