package heranca;

public class Dentista extends ProfissionalConsulta{

protected String cro;
	
	public Dentista () {}
		
		public Dentista (String nome, String especialidade,int valorConsulta,String cro) {
		super ( nome,especialidade,valorConsulta);
		this.cro = cro;
		}
		public void agendarConsulta() {}
	
}
