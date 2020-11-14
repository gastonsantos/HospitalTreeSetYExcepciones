package ar.edu.unlam.pb2;

public class Paciente  extends Persona {

	private Integer id;
	private String enfermedad;
	private Boolean atendido;
	
	
	public Paciente(Integer dni, String nombre, String apellido, Integer edad,Integer id, String enfermedad) {
		super(dni, nombre, apellido, edad);
		this.enfermedad = enfermedad;
		this.id= id;
		this.atendido= false;
	}


	public Boolean getAtendido() {
		return atendido;
	}


	public void setAtendido(Boolean atendido) {
		this.atendido = atendido;
	}


	@Override
	public String toString() {
		return "Paciente [id=" + id + ", enfermedad=" + enfermedad + "]";
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEnfermedad() {
		return enfermedad;
	}


	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	
}
