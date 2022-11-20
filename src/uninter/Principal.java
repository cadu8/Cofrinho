package uninter;

import java.util.List;
import java.util.Locale;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//NOME DO ALUNO: CARLOS EDUARDO PEDROZO LEMES
		//RU: 3933267
		
		System.out.println("======COFRINHO======");
		System.out.println("DONO DO COFRINHO: CARLOS EDUARDO PEDROZO LEMES");
		System.out.println("RU: 3933267");
		
		//puxei e instanciei a classe Lobby
		Lobby lobby = new Lobby();
		//imprimi na tela o metodo mostrarMenu da classe Lobby
		lobby.mostrarMenu();
		

			
		
		
	}

}
