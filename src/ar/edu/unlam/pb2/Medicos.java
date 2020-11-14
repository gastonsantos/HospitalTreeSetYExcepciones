package ar.edu.unlam.pb2;

public class Medicos extends Persona{
	private Double sueldo;
	private Ocupacion ocupacion;
	
	public Medicos(Integer dni, String nombre, String apellido, Integer edad, Double sueldo, Ocupacion ocupacion) {
		super(dni, nombre, apellido, edad);
		this.sueldo = sueldo;
		this.ocupacion = ocupacion;
		
		
	}

	@Override
	public String toString() {
		return "Medicos [sueldo=" + sueldo + ", ocupacion=" + ocupacion + "]";
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Ocupacion getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(Ocupacion ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	
	
	
}
