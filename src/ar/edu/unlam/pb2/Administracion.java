package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.TreeSet;

public class Administracion {
	private static Integer cupo =5;
	private String nombre;
	private TreeSet<Paciente> pacientes;
	private TreeSet<Medicos> medicos;
	private HashSet<Consultorio> consultorios;
	
	public Administracion(String nombre) {
		this.nombre= nombre;
		this.pacientes = new TreeSet<Paciente>();
		this.medicos = new TreeSet<Medicos>();
		this.consultorios = new HashSet<Consultorio>();
		
		
	}
	public static Integer getCupo() {
		return cupo;
	}
	public Boolean agregoMedicoAStaff (Medicos medico1)throws CantidadSuperadaPacientesEnHospital,NullPointerException{
		if(medico1.equals(null)){
			throw new NullPointerException();
		}
		if(cupo>=medicos.size()){
			throw new CantidadSuperadaPacientesEnHospital();
		}
		return medicos.add(medico1);
		
	}
	
	public Boolean agregoPacienteAStaff (Paciente paciente1)throws CantidadSuperadaPacientesEnHospital {
		if(cupo>=pacientes.size()){
			throw new CantidadSuperadaPacientesEnHospital();
		}
		return pacientes.add(paciente1);
	}
	public Boolean agregoConsultorioALista(Consultorio consultorio1){
		return consultorios.add(consultorio1);
	}
	
	//UN REPORTE QUE DEVUELVE LOS PACIENTES CON GRIPE
	public TreeSet<Paciente> PacientesConGripe(){
		TreeSet<Paciente> listado = new TreeSet<Paciente>();
		for(Paciente e: pacientes){
			if(e.getEnfermedad().equals("Gripe")){
				listado.add(e);
			}
		}
		return listado;
		
	}
	
	
	public Boolean agregoPacienteAConsultorio (Paciente paciente1, Consultorio consultorio1){
		Paciente pacienteAASignar = Buscarpaciente(paciente1.getDni());
		Consultorio consultorioAAsignar = BuscarConsultorio(consultorio1);
		if(pacienteAASignar != null && consultorioAAsignar !=null && consultorio1.getCupo()>consultorio1.contarPacientesEnConsultorio() ){
			consultorioAAsignar.agregoPaciente(paciente1);
			return true;
		}else{
			return false;
		}
		
		
	}
	
	public Paciente Buscarpaciente(Integer dni){
		for(Paciente e: pacientes){
			if(e.getDni().equals(dni)){
				return e;
					
			}
		}
		return null;
	}
	public Consultorio BuscarConsultorio (Consultorio consul1){
		for(Consultorio e: consultorios){
			if(e.equals(consul1)){
				return e;
			}
		}
		return null;
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	public void mostrarPorPantallaPacientes(){
		
		for(Paciente e: pacientes){
			System.out.println(e.getNombre()+"  "+e.getApellido()+"  "+e.getDni()+"  "+e.getEdad()+"\n ");
		}
	}
	
	public void mostrarMedicosPorPantalla(){
		for(Medicos e: medicos){
			System.out.println(e.getNombre()+"  "+e.getApellido()+"  "+e.getDni()+"  "+e.getEdad()+"\n ");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public TreeSet<Paciente> getPacientes() {
		return pacientes;
	}


	public void setPacientes(TreeSet<Paciente> pacientes) {
		this.pacientes = pacientes;
	}


	public TreeSet<Medicos> getMedicos() {
		return medicos;
	}


	public void setMedicos(TreeSet<Medicos> medicos) {
		this.medicos = medicos;
	}
	public HashSet<Consultorio> getConsultorios() {
		return consultorios;
	}
	public void setConsultorios(HashSet<Consultorio> consultorios) {
		this.consultorios = consultorios;
	}





	
	
	
}
