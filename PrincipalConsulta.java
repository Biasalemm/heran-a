package heranca;

public class PrincipalConsulta {

	public static void main(String[] args) {
		
		Medico paciente1 = new Medico ("Marcos","Neurocirurgião",500,"01");
		paciente1.agendarConsulta();
		
		Dentista  paciente2 = new Dentista ("Pedro","Protese",150,"05");
		paciente2.agendarConsulta();
		
		Fisioterapeuta paciente3 = new Fisioterapeuta ("Vinicius","lombar",250,"07");
		paciente3.agendarConsulta();
	}
	

}
