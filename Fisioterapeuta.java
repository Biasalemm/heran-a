package heranca;

public class Fisioterapeuta extends ProfissionalConsulta {

protected String crefito;
	
	public Fisioterapeuta () {}
		
		public Fisioterapeuta (String nome, String especialidade,int valorConsulta,String crefito) {
		super ( nome,especialidade,valorConsulta);
		this.crefito = crefito;
		}
		public void agendarConsulta() {}
	
}
