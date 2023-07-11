package trabalho;

import java.util.Scanner;

public class Menu {
	
	private Cofre cofrinho;

	private Scanner teclado;
	 public Menu(){
		teclado = new Scanner (System.in);
		cofrinho = new Cofre();
	 }
	 public void MostrarMenu() {
		 int opc;
		 do {
		 System.out.println("Cofrinho: \n"
			+ "1- Adicionar moeda\n"
			+ "2- Remover moeda\n"
			+ "3- Listar moedas\n"
			+ "4- Calcular total de moedas convertido para Real\n"
			+ "0- Encerrar");
	
		 opc = teclado.nextInt();
	
	switch(opc) {
	case 1:
		addMoedas();
			break;

	case 2:
		RemoveMoedas();
		break;
		
	case 3:
		System.out.println("Você possui em seu cofre as seguintes moedas: ");
		cofrinho.ListagemMoedas();
		break;
	case 4:
		double ValorTotalConvertido = cofrinho.TotalConvertido();
		String ValorConvertidoTotalText = String.format("%.2f",ValorTotalConvertido);
		ValorConvertidoTotalText = ValorConvertidoTotalText.replace(".", ",");
		System.out.println("Valor total convertido para real: " + ValorConvertidoTotalText);
		break;
		
	default:
		System.out.println("Opção inválida. Escholha uma opção válida");
		break;
	}
		 }
	while(opc!=0); {
		System.out.println("Encerrando ...");
	}
}
	 
	private void addMoedas() {
		System.out.println("Escolha uma moeda:\n"
				+ "1- Real\n"
				+ "2- Dolar\n"
				+ "3- Euro");
			int opcMoeda = teclado.nextInt();
			
		System.out.println("Digite um valor: ");
		String textMoeda = teclado.next();
		textMoeda = textMoeda.replace(",", ".");
		double ValorMoeda = Double.valueOf(textMoeda);
		
		Moeda moeda = null;
		if(opcMoeda == 1) {
			moeda = new Real(ValorMoeda);
			
		} else if(opcMoeda == 2) {
				 moeda = new Dolar(ValorMoeda);
		}
		else if(opcMoeda == 3) {
			moeda = new Euro(ValorMoeda);
	}else {
		System.out.println("A moeda digitada não é válida, digie uma moeda válida");
		MostrarMenu();
	}
		cofrinho.add(moeda);
		System.out.println("Voce adicionou a opção: " + opcMoeda + " No valor de: " + ValorMoeda+ "\n"
				+ "Com sucesso!!");
	}
	private void RemoveMoedas() {
		System.out.println("Escolha uma moeda:\n"
				+ "1- Real\n"
				+ "2- Dolar\n"
				+ "3- Euro");
			int opcMoeda = teclado.nextInt();
			
		System.out.println("Digite um valor: ");
		String textMoeda = teclado.next();
		textMoeda = textMoeda.replace(",", ".");
		double ValorMoeda = Double.valueOf(textMoeda);
		
		Moeda moeda = null;
		if(opcMoeda == 1) {
			moeda = new Real(ValorMoeda);
			
		} else if(opcMoeda == 2) {
				 moeda = new Dolar(ValorMoeda);
		}
		else if(opcMoeda == 3) {
			moeda = new Euro(ValorMoeda);
	}else {
		System.out.println("A moeda digitada não é válida, digie uma moeda válida");
		MostrarMenu();
	}
		if(cofrinho.Remover(moeda)) {
			System.out.println("Moeda Removida com Sucesso.");
		} else {
			System.out.println("Não foi encontrada uma moeda com esse valor.");
		}
	}
}