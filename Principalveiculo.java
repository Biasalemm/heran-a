package heranca;

public class Principalveiculo {

	public static void main(String[] args) {
		Automovel carro1 = new Automovel ("ford","gt","branco",2008,5,"V8");
        carro1.exibirInfo();
        
        moto moto1 = new moto ("Honda","cg","Azul",2020,150);
        moto1.exibirInfo();
	}

}
