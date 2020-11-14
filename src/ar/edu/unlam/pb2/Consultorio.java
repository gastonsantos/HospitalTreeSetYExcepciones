package ar.edu.unlam.pb2;

import java.util.TreeSet;

public class Consultorio {
private Integer numero;
private Integer cupo;
private Medicos medico1;
private TreeSet<Paciente> pacientesMedico;

public Consultorio(Integer numero, Medicos medico1, Integer cupo) {
	this.pacientesMedico = new TreeSet<Paciente>();
	this.medico1 = medico1;
	this.numero = numero;
	this.cupo = cupo;
}

public Integer contarPacientesEnConsultorio(){
	return pacientesMedico.size();
	
}


public Boolean agregoPaciente(Paciente paciente1){
	Boolean agrego = false;
	if(paciente1.getAtendido().equals(false)){
		pacientesMedico.add(paciente1);
		agrego = true;
	}
	return agrego;
}



public void Atendido(Paciente paciente1){
	
	paciente1.setAtendido(true);
	pacientesMedico.remove(paciente1);
	
}










public Integer getCupo() {
	return cupo;
}
public void setCupo(Integer cupo) {
	this.cupo = cupo;
}
public Integer getNumero() {
	return numero;
}
public void setNumero(Integer numero) {
	this.numero = numero;
}
public Medicos getMedico1() {
	return medico1;
}
public void setMedico1(Medicos medico1) {
	this.medico1 = medico1;
}
public TreeSet<Paciente> getPacientesMedico() {
	return pacientesMedico;
}
public void setPacientesMedico(TreeSet<Paciente> pacientesMedico) {
	this.pacientesMedico = pacientesMedico;
}
	
	
}
