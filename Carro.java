package br.com.caze.veiculo;

public class Carro extends Veiculo {
	
	private int qtdPortas;
	private boolean cinto;
	private int qtdTapete;
	

	public Carro(String cor, String modelo, String marca, int qtdPortas, boolean cinto, int qtdTapete) {
		super(cor, modelo, marca);
		this.qtdPortas = qtdPortas;
		this.cinto = cinto;
		this.qtdTapete = qtdTapete;
	}


	public void LigarParabrisa() {
		
		System.out.println("Ligando parabrisa...");
	}
	

}
