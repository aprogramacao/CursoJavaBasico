package org.itstep.aula1.lab;

import java.util.Scanner;

/*
 * Classe para exercicio realizado em sala de aula
 * 
 * Construir um programa Java para identificar o ano escolar de uma quantidade qualquer de alunos. 
 * Utilize os comandos switch-case e for. 
 * Utilize entrada de dados via console. 
 * Utilize o exemplo apresentado no quadro em sala de aula.
 */
public class AnoEscolarPorIdade {
	public static void main(String[] args) {
		// processador da console de entrada
		Scanner entrada = new Scanner(System.in);
		// idade da crian�a para avaliacao
		int idade;
		// loop para a quantidade de alunos
		for (int i = 0; i < 3; i++) {
			// leitura da idade do aluno
			System.out.println("Informe a idade do candidato (" + i + "): ");
			idade = entrada.nextInt();
			// processamento do ano escolar de acordo com a idade
			switch (idade) {
			case 0:
				System.out.println("Ensino Infantil - Ber��rio 1");
				break;
			case 1:
				System.out.println("Ensino Infantil - Ber��rio 2");
				break;
			case 2:
				System.out.println("Ensino Infantil - Maternal 1");
				break;
			case 3:
				System.out.println("Ensino Infantil - Maternal 2");
				break;
			case 4:
				System.out.println("Ensino Infantil - Pr� 1");
				break;
			case 5:
				System.out.println("Ensino Infantil - Pr� 2");
				break;
			case 6:
				System.out.println("Ensino Fundamental - 1� ano");
				break;
			case 7:
				System.out.println("Ensino Fundamental - 2� Ano");
				break;
			case 8:
				System.out.println("Ensino Fundamental - 3� Ano");
				break;
			case 9:
				System.out.println("Ensino Fundamental - 4� Ano");
				break;
			case 10:
				System.out.println("Ensino Fundamental - 5� Ano");
				break;
			case 11:
				System.out.println("Ensino Fundamental - 6� Ano");
				break;
			case 12:
				System.out.println("Ensino Fundamental - 7� Ano");
				break;
			case 13:
				System.out.println("Ensino Fundamental - 8� Ano");
				break;
			case 14:
				System.out.println("Ensino Fundamental - 9� Ano");
				break;
			case 15:
				System.out.println("Ensino M�dio - 1� Ano");
				break;
			case 16:
				System.out.println("Ensino M�dio - 2� Ano");
				break;
			case 17:
				System.out.println("Ensino M�dio - 3� Ano");
				break;
			case 18:
				System.out.println("Ensino Superior - 1� Ano");
				break;
			case 19:
				System.out.println("Ensino Superior - 2� Ano");
				break;
			case 20:
				System.out.println("Ensino Superior - 3� Ano");
				break;
			case 21:
				System.out.println("Ensino Superior - 4� Ano");
				break;
			default:
				// tratamento dos casos excepcionais
				if (idade < 0) {
					System.out.println("Idade Inv�lida");
				} else {
					System.out.println("Idade Fora do Esperado - Procure o servi�o de Educa��o para Jovens e Adultos");
				}
			}
		}
		// mensagem de encerramento do processamento
		System.out.println("Pesquisa encerrada");
		// fechar a entrada de dados
		entrada.close();
	}
}
