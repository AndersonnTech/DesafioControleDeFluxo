package model;

import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		terminal.close();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException ex) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(ex.getMessage());
		}
	}

	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois) { 
			throw new ParametrosInvalidosException("O primeiro parmetro deve ser maior que o segundo");
		}
		
		
		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem
			for(int i=1; i<=contagem; i++) {
				System.out.println("Imprimindo o número "+ i );
			}
	}
	
	

}