package uninter;

import java.util.Scanner;

public class Lobby {
	
	private Scanner sc; //chamamos a classe scanner para obter entrada de dados
	private Cofrinho cofrinho;
	
	public Lobby() { //criamos o construtor padrao 
		sc = new Scanner(System.in); //quando Lobby for instanciado, o Scanner sera chamado.
		cofrinho = new Cofrinho();
	}
	
	
	public void mostrarMenu() { //metodo que ira imprimir na tela o menu
		System.out.println("");
		System.out.println("1-Adicionar moeda");
		System.out.println("2-Remover moeda");
		System.out.println("3-Listar moeda");
		System.out.println("4-Calcular valor total convertido para real");
		System.out.println("0-Encerrar");
		
		String metodoEscolhido = sc.next();
		
		switch (metodoEscolhido) {
		
			case "0":
				System.out.println("Encerrado!");
				break;
				
			case "1":
				mostrarSubMenuAdicionarMoeda(); //metodo puxado para apresentar nosso segundo menu
					
				mostrarMenu();
				break;
			
			case "2":
				mostrarSubMenuRemoverMoeda(); //metodo puxado para apresentar nosso segundo menu
				
				mostrarMenu();
				break;
				
			case "3":
				cofrinho.listagemMoedas();
				mostrarMenu();
				break;
				
			case "4":
				double valorTotalEmReal = cofrinho.totalConvertido();
				String valorTotalEmRealString = String.format("%.2f", valorTotalEmReal);
				valorTotalEmRealString = valorTotalEmRealString.replace(".", ",");
				System.out.println("O valor total convertido para real: " + valorTotalEmRealString);
				mostrarMenu();
				break;
				
			default:
				System.out.println("Opção incalida!");
				mostrarMenu(); //se for uma opçao invalida, iremos chamar novamante o nosso metodo
				break;
		}
	}
	
	/*- metodo criado para deixar nosso switch mais limpo
	 *-sua funçao é criar um segundo menu para selecionar o tipo de moeda
	 */
	private void mostrarSubMenuAdicionarMoeda() {
		System.out.println("Escolha moeda: ");
		System.out.println("1 - Real:");
		System.out.println("2 - Dólar:");
		System.out.println("3 - Euro:");
		
		int valorMoeda = sc.nextInt();
		
		System.out.println("Digite o valor:");
		String valorEscolhidoString = sc.next();
		valorEscolhidoString = valorEscolhidoString.replace(",", ".");
		double valorEscolhido = Double.valueOf(valorEscolhidoString);
		
		Moeda moeda = null;
		
		if(valorMoeda == 1) {
			moeda = new Real(valorEscolhido);
		}else if(valorMoeda == 2) {
			moeda = new Dolar(valorEscolhido);
		}else if(valorMoeda == 3) {
			moeda = new Euro(valorEscolhido);
		}else {
			System.out.println("Não tem essa moeda!");
			mostrarMenu();
		}
		cofrinho.adicionar(moeda);
		System.out.println("Moeda guarda!");
	}
	
	private void mostrarSubMenuRemoverMoeda() {
		System.out.println("Escolha moeda: ");
		System.out.println("1 - Real:");
		System.out.println("2 - Dólar:");
		System.out.println("3 - Euro:");
		
		int valorMoeda = sc.nextInt();
		
		System.out.println("Digite o valor:");
		String valorEscolhidoString = sc.next();
		valorEscolhidoString = valorEscolhidoString.replace(",", ".");
		double valorEscolhido = Double.valueOf(valorEscolhidoString);
		
		Moeda moeda = null;
		
		if(valorMoeda == 1) {
			moeda = new Real(valorEscolhido);
		}else if(valorMoeda == 2) {
			moeda = new Dolar(valorEscolhido);
		}else if(valorMoeda == 3) {
			moeda = new Euro(valorEscolhido);
		}else {
			System.out.println("Não tem essa moeda!");
			mostrarMenu();
		}
		cofrinho.remover(moeda);
		
	}
}
