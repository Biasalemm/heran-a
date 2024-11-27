package heranca;

public class moto extends veiculo{
	
	protected int cilindrada;
	
	public moto() {}
	
	public moto(String marca, String modelo, String cor, int ano,int cilindrada) {
		super(marca, modelo, ano, cor);
	this.cilindrada = cilindrada;
	}

	public void exibirInfo () {
		System.out.println( "cilindradas: " + cilindrada);
	}
	}

