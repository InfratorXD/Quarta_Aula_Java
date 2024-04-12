package br.com.caze.veiculo;

public class Moto extends Veiculo {

	private boolean peDeDescanso;
	
	public Moto(String cor, String modelo, String marca, boolean peDeDescanso) {
		super(cor, modelo, marca);
		this.peDeDescanso = peDeDescanso;
	}



	public void abrirPeDeDescanso() {
		System.out.println("Abrindo pé de descanso...");
	}
}
