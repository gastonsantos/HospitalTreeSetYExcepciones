package ar.edu.unlam.pb2;

public class Persona implements Comparable<Persona> {
	private Integer dni;
	private String nombre;
	private String apellido;
	private Integer edad;
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	public Persona(Integer dni, String nombre, String apellido, Integer edad) {
		this.dni = dni;
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	@Override
	public int compareTo(Persona Persona1) {
		if(this.edad.compareTo(Persona1.edad)==0){
			return this.nombre.compareTo(Persona1.nombre);	
			}
	return this.edad.compareTo(Persona1.edad);
	}
	
	
	
	
	

}
