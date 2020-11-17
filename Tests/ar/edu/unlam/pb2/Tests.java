package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test(expected = CantidadSuperadaPacientesEnHospital.class)
	public void testQueIngresaPacienteAHostpitalYLosMuestraOrdenados() throws Exception {
		Administracion admin1 = new Administracion ("Hospitalito");
		Paciente roberto = new Paciente (33022376, "Alan", "DeBoedo", 65, 001,"Gripe");
		Paciente pedro = new Paciente (2654554, "Pedri", "Victor", 22, 005,"Gripe");
		Paciente juan = new Paciente (11478745, "Zapata", "JuanCruz", 68, 004,"Gripe");
		Paciente gaston= new Paciente (2565987, "Ximena", "Vera", 45, 003,"Gripe");
		Paciente teo = new Paciente (98545652, "Balcon", "Speed", 25, 002,"Gripe");
		
		admin1.agregoPacienteAStaff(teo);
		admin1.agregoPacienteAStaff(gaston);
		admin1.agregoPacienteAStaff(juan);
		admin1.agregoPacienteAStaff(pedro);
		admin1.agregoPacienteAStaff(roberto);
		admin1.mostrarPorPantallaPacientes();
	}
	@Test 
	public void testQueIngresMedicosYLosMuestraOrdenados() throws Exception{
		Administracion admin1 = new Administracion ("Hospitalito");
		Medicos medico1 = new Medicos(25415451, "Oscar", "MediaVilla", 45, 500.00, Ocupacion.cardiologo);
		Medicos medico2 = new Medicos(415451, "Juan", "Teto", 50, 500.00, Ocupacion.oncologo);
		Medicos medico3 = new Medicos(425415451, "Augusto", "Prato", 45, 500.00, Ocupacion.cardiologo);
		Medicos medico4 = new Medicos(245025451, "Zanella", "Villa", 22, 500.00, Ocupacion.cardiologo);
		admin1.agregoMedicoAStaff(medico1);
		admin1.agregoMedicoAStaff(medico2);
		admin1.agregoMedicoAStaff(medico3);
		admin1.agregoMedicoAStaff(medico4);
		admin1.mostrarMedicosPorPantalla();
		
		
		
	}
	
	@Test 
	public void testQueCreoUnConsultorioLeAgregoMedicoYPacientes() throws Exception{
		Administracion admin1 = new Administracion ("Hospitalito");
		
		Medicos medico1 = new Medicos(25415451, "Oscar", "MediaVilla", 45, 500.00, Ocupacion.cardiologo);
		admin1.agregoMedicoAStaff(medico1);
		Consultorio consultorio1 = new Consultorio(01, medico1, 20);
		admin1.agregoConsultorioALista(consultorio1);
		Paciente roberto = new Paciente (33022376, "Alan", "DeBoedo", 65, 001,"Gripe");
		Paciente pedro = new Paciente (2654554, "Pedri", "Victor", 22, 005,"Gripe");
		Paciente juan = new Paciente (11478745, "Zapata", "JuanCruz", 68, 004,"Gripe");
		Paciente pancho = new Paciente (11471235, "Tha", "Cruz", 68, 004,"Gripe");
		admin1.agregoPacienteAStaff(juan);
		admin1.agregoPacienteAStaff(pancho);
		admin1.agregoPacienteAStaff(pedro);
		admin1.agregoPacienteAStaff(roberto);
		
		admin1.agregoPacienteAConsultorio(juan, consultorio1);
		admin1.agregoPacienteAConsultorio(pedro, consultorio1);
		admin1.agregoPacienteAConsultorio(roberto, consultorio1);
		Integer ve = 3;
		Integer vo=consultorio1.contarPacientesEnConsultorio();
		assertEquals(ve,vo);
		
	
	}
	@Test
	public void testQueVerificaLaCantidadDeEnfermosConGripe() throws Exception{
		Administracion admin1 = new Administracion ("Hospitalito");
		
		Medicos medico1 = new Medicos(25415451, "Oscar", "MediaVilla", 45, 500.00, Ocupacion.cardiologo);
		admin1.agregoMedicoAStaff(medico1);
		Consultorio consultorio1 = new Consultorio(01, medico1, 2);
		admin1.agregoConsultorioALista(consultorio1);
		Paciente roberto = new Paciente (33022376, "Alan", "DeBoedo", 65, 001,"Gripe");
		Paciente pedro = new Paciente (2654554, "Pedri", "Victor", 22, 005,"Gripe");
		Paciente juan = new Paciente (11478745, "Zapata", "JuanCruz", 68, 004,"SIDA");
		Paciente pancho = new Paciente (11471235, "Tha", "Cruz", 68, 004,"Fiebre");
		
		admin1.agregoPacienteAStaff(juan);
		admin1.agregoPacienteAStaff(pancho);
		admin1.agregoPacienteAStaff(pedro);
		admin1.agregoPacienteAStaff(roberto);
		
		Integer ve = 2;
		Integer vo= admin1.PacientesConGripe().size();
		assertEquals(ve,vo);
		
	}
	
	@Test(expected = CantidadSuperadaPacientesEnHospital.class)
	public void testQueNoPuedoAgregarMasPacientesAStaffYEnviaUnaException() throws CantidadSuperadaPacientesEnHospital{
		Administracion admin1 = new Administracion ("Hospitalito");
		
		Paciente roberto = new Paciente (33022376, "Alan", "DeBoedo", 65, 001,"Gripe");
		Paciente pedro = new Paciente (2654554, "Pedri", "Victor", 22, 005,"Gripe");
		Paciente juan = new Paciente (11478745, "Zapata", "JuanCruz", 68, 004,"Gripe");
		Paciente pancho = new Paciente (11471235, "Tha", "Cruz", 68, 004,"Gripe");
		Paciente tincho = new Paciente (115, "Tha", "Cruz", 68, 002,"Gripe");
		admin1.agregoPacienteAStaff(juan);
		admin1.agregoPacienteAStaff(pancho);
		admin1.agregoPacienteAStaff(pedro);
		admin1.agregoPacienteAStaff(roberto);
		admin1.agregoPacienteAStaff(tincho);	
	}
	@Test (expected = CantidadSuperadaPacientesEnHospital.class)
	public void testQueNoPuedoAgregarUnMedicoPorQueElCupoEstaLLenoYEnviaUnaException() throws CantidadSuperadaPacientesEnHospital{
		
		Administracion admin1 = new Administracion ("Hospitalito");
		Medicos medico1 = new Medicos(25415451, "Oscar", "MediaVilla", 45, 500.00, Ocupacion.cardiologo);
		Medicos medico2 = new Medicos(415451, "Juan", "Teto", 50, 500.00, Ocupacion.oncologo);
		Medicos medico3 = new Medicos(425415451, "Augusto", "Prato", 45, 500.00, Ocupacion.cardiologo);
		Medicos medico4 = new Medicos(245025451, "Zanella", "Villa", 22, 500.00, Ocupacion.cardiologo);
		Medicos medico5 = new Medicos(55451, "Peranella", "Santi", 22, 500.00, Ocupacion.cardiologo);
		admin1.agregoMedicoAStaff(medico1);
		admin1.agregoMedicoAStaff(medico2);
		admin1.agregoMedicoAStaff(medico3);
		admin1.agregoMedicoAStaff(medico4);
		admin1.agregoMedicoAStaff(medico5);
		
	}
	
	@Test (expected = NullPointerException.class)
	public void testQueNoPuedoAgregarMedicoPorQueNoExisteYEnviaUnaExcepcion() throws NullPointerException, CantidadSuperadaPacientesEnHospital {
		
		Administracion admin1 = new Administracion ("Hospitalito");
		Medicos medico1 = new Medicos(25415451, "Oscar", "MediaVilla", 45, 500.00, Ocupacion.cardiologo);
		Consultorio consultorio1 = new Consultorio(01, medico1, 2);
		admin1.agregoMedicoAStaff(null);
	}
	
	@Test(expected = NullPointerException.class)
	public void testQueNoPuedoAgregarPacientePorQueNoExiste() throws NullPointerException, CantidadSuperadaPacientesEnHospital {
		Administracion admin1 = new Administracion ("Hospitalito");
		
		admin1.Buscarpaciente(33022376);
			
		
	}
	@Test(expected = CupoDeConsultorioLLeno.class)
	public void testQueNoPuedoAgregarPacientePorQueEstaLLenoConsultoriO() throws NullPointerException, CantidadSuperadaPacientesEnHospital, CupoDeConsultorioLLeno {
		Administracion admin1 = new Administracion ("Hospitalito");
		Medicos medico1 = new Medicos(25415451, "Oscar", "MediaVilla", 45, 500.00, Ocupacion.cardiologo);
		Consultorio consultorio1 = new Consultorio(01, medico1, 3);
		admin1.agregoConsultorioALista(consultorio1);
		admin1.agregoMedicoAStaff(medico1);
		Paciente roberto = new Paciente (33022376, "Alan", "DeBoedo", 65, 001,"Gripe");
		Paciente pedro = new Paciente (2654554, "Pedri", "Victor", 22, 005,"Gripe");
		Paciente juan = new Paciente (11478745, "Zapata", "JuanCruz", 68, 004,"Gripe");
		Paciente pancho = new Paciente (11471235, "Tha", "Cruz", 68, 004,"Gripe");
		admin1.agregoPacienteAStaff(juan);
		admin1.agregoPacienteAStaff(pancho);
		admin1.agregoPacienteAStaff(pedro);
		admin1.agregoPacienteAStaff(roberto);
		admin1.agregoPacienteAConsultorio(roberto, consultorio1);
		admin1.agregoPacienteAConsultorio(pedro, consultorio1);
		admin1.agregoPacienteAConsultorio(juan, consultorio1);
		admin1.agregoPacienteAConsultorio(pancho, consultorio1);
		
		
	}
	
	
	

}
