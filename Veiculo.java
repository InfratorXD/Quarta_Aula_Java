package br.com.caze.veiculo;

public class Veiculo {
	
	private String cor;
	private String modelo;
	private String marca;
	
	public Veiculo(String cor, String modelo, String marca) {
		this.cor = cor;
		this.modelo = modelo;
		this.marca = marca;
	}
	
	public void acelerar() {
		
		System.out.println("Acelerando..." + modelo);
	}
	
	public void freiar() {
		
		System.out.println("Freiando..." + modelo);
	}
	
	

}
