package heranca;

public class Automovel extends veiculo{
	
	int numeroPortas;
	String motor;
	
	public Automovel() {}
	
	public Automovel(String marca, String modelo, String cor, int ano, int numeroPortas,String motor) {
	super(marca, modelo, ano, cor);

	this.numeroPortas = numeroPortas;
	this.motor = motor;
	}
	
	
	public void exibirInfo () {
		System.out.println( "Numero de portas: " + numeroPortas);
		System.out.println(" Motor: " + motor);
	}
	}


