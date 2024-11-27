package heranca;

public class Empresa {
	private String nome;
	private Departamento departamento;
	public String getNome() {
		return nome;
	}
public Empresa(String nome, Departamento departamento) {
		super();
		this.nome = nome;
		this.departamento = departamento;
	}

public void setNome(String nome) {
	this.nome = nome;
}
public Departamento getDepartamento() {
	return departamento;
}
public void setDepartamento(Departamento departamento) {
	this.departamento = departamento;
}

}
