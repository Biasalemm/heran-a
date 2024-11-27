package heranca;

public  class Medico extends ProfissionalConsulta {

	protected String crm;
	
	public Medico () {}
		
		public Medico (String nome, String especialidade,int valorConsulta,String crm) {
		super ( nome,especialidade,valorConsulta);
		this.crm = crm;
		}
		public void agendarConsulta() {}
	
	

	
}
