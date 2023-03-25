package uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		Cofrinho cofrinho = new Cofrinho();
		
		System.out.println("COFRINHO");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Calcular total convertido para Real");
		System.out.println("0-Encerrar");
		opcao = teclado.nextInt();
		
		int tipoMoe;
		int valor;
		Moeda moeda;
		
		while(opcao != 0) {
			
			switch(opcao) {
			case 1:
				tipoMoe = 0;
				while(tipoMoe > 3 || tipoMoe <= 0) {
					System.out.println("Escolha o tipo de moeda:");
					System.out.println("1-Euro");
					System.out.println("2-Dolar");
					System.out.println("3-Real");
					tipoMoe = teclado.nextInt();
				}
				System.out.println("Digite o valor:");
				valor = teclado.nextInt();
				
				moeda = null;
				if(tipoMoe == 1) {
					moeda = new Euro(valor);
				}
				else if (tipoMoe == 2) {
					moeda = new Dolar(valor);
				}
				else {
					moeda = new Real(valor);
				}
				
				cofrinho.adicionar(moeda);
					
			break;
			case 2:
				tipoMoe = 0;
				while(tipoMoe > 3 || tipoMoe <= 0) {
					System.out.println("Escolha o tipo de moeda:");
					System.out.println("1-Euro");
					System.out.println("2-Dolar");
					System.out.println("3-Real");
					tipoMoe = teclado.nextInt();
				}
				System.out.println("Digite o valor:");
				valor = teclado.nextInt();
				
				moeda = null;
				if(tipoMoe == 1) {
					moeda = new Euro(valor);
				}
				else if (tipoMoe == 2) {
					moeda = new Dolar(valor);
				}
				else {
					moeda = new Real(valor);
				}
				
				cofrinho.remover(moeda);
				
			break;
			case 3:
				cofrinho.listar();
			break;
			case 4:
				double valorConvertido = cofrinho.converter();
				System.out.println("Valor total de moedas convertido para Real: " + valorConvertido);
			break;
			default:
				System.out.println("Valor Inválido");
			}
			System.out.println("COFRINHO");
			System.out.println("1-Adicionar");
			System.out.println("2-Remover");
			System.out.println("3-Listar");
			System.out.println("4-Calcular total convertido para Real");
			System.out.println("0-Encerrar");
			opcao = teclado.nextInt();
		}

	}

}
