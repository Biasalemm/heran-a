package heranca;

public class ProfissionalConsulta {

 protected String nome;
 protected String especialidade;
 protected int valorConsulta;
 
public ProfissionalConsulta() {
	
}
public ProfissionalConsulta (String nome, String especialidade,int valorConsulta) {
	this.nome = nome;
	this.especialidade = especialidade;
	this. valorConsulta =  valorConsulta;
}

    public void agendarConsulta() {}
 }
