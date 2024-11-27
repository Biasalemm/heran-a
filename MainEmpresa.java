package heranca;

public class MainEmpresa {

	public static void main(String[] args) {
		Departamento departamento = new Departamento ("RH");
		Empresa empresa = new Empresa ("Contabil", departamento);
		
		System.out.println("Trabalho na empresa " + empresa.getNome()+ " no setor de " + departamento.getNome());

	}

}
