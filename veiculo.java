package heranca;

public class veiculo {
public veiculo(String marca, String modelo, int ano, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}

protected String marca;
protected String modelo;
protected int ano;
protected String cor;

public veiculo (){
	
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getAno() {
	return ano;
}

public void setAno(int ano) {
	this.ano = ano;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}


















}
