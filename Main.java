package br.com.caze.main;

import br.com.caze.veiculo.Carro;
import br.com.caze.veiculo.Moto;

public class Main {

	public static void main(String[] args) {
		
		Carro uno = new Carro("Azul","Bally","Fiat",4,true,4);
		Carro polo = new Carro("Prata","Polo","Volks",4,true,4);
		Moto bmw = new Moto("Branca","Z6","Bmw", true);

		uno.acelerar();
		polo.acelerar();
		uno.LigarParabrisa();
		bmw.abrirPeDeDescanso();

}
}
