/*
 * Construir um programa Java que apresente um menu de opções para o 
 * cálculo das seguintes operações entre dois números:
 * • adição; subtração; multiplicação; divisão.
 * E que deverá possibilitar ao usuário:
 * • escolher a operação desejada;
 * • informar os dois números para a operação.
 * Daí, o programa deverá:
 * • apresentar como saída a operação escolhida, os números informados e o resultado do cálculo;
 * • retornar ao menu de opções;
 * NOTA: O menu de opções deverá possuir uma opção de término do programa.
 */
package aprogramacao.java.class2.homework;
import java.util.Scanner;
public class CalculadoraSimples {
	public static void main(String[] args) {
		// string que apresenta o menu
		StringBuffer strBuffer = new StringBuffer("\n\nInforme a operação desejada:\n");
		strBuffer.append("(1) Adição\n");
		strBuffer.append("(2) Subtração\n");
		strBuffer.append("(3) Multiplicação\n");
		strBuffer.append("(4) Divisão\n");
		strBuffer.append("(9) Encerrar\n");
		// variáveis para operandos, operacao e resultado.
		double operando1 = 0.0;
		double operando2 = 0.0;
		double resultado = 0.0;
		int operacao = 0;
		// processador da console de entrada
		Scanner entrada = new Scanner(System.in);
		// loop para processar operacoes 
		do {
			// apresentacao do menu
			System.out.println(strBuffer.toString());
			// entrada da operacao
			operacao = entrada.nextInt();
			// caso operacao nao encerramento
			if (operacao == 1 || operacao == 2 || operacao == 3 || operacao == 4) {
				// entrada do operando 1
				System.out.println("Informe o operando (1): ");
				operando1 = entrada.nextDouble();
				// entrada do operando 2
				System.out.println("Informe o operando (2): ");
				operando2 = entrada.nextDouble();
				// processamento da operacao escolhida
				switch (operacao) {
				case 1:
					// obter e emitir o resultado
					resultado = operando1 + operando2;
					System.out.println("RESULTADO: " + operando1 + " + " + operando2 + " = " + resultado);
					break;
				case 2:
					// obter e emitir o resultado
					resultado = operando1 - operando2;
					System.out.println("RESULTADO: " + operando1 + " - " + operando2 + " = " + resultado);
					break;
				case 3:
					// obter e emitir o resultado
					resultado = operando1 * operando2;
					System.out.println("RESULTADO: " + operando1 + " * " + operando2 + " = " + resultado);
					break;
				case 4:
					// caso nao divisao por zero
					if (operando2 != 0) {
						// obter e emitir o resultado
						resultado = operando1 / operando2;
						System.out.println("RESULTADO: " + operando1 + " / " + operando2 + " = " + resultado);
					} else {
						// emitir mensagem de erro
						System.out.println("ERRO: Divisão por zero idevida.");
					}
					break;
				}
			} else if (operacao != 9) { // caso operacao diferente de encerrar
				// emitir mensagem de erro
				System.out.println(">>> Operação idevida.");
			} else {
				// emitir mensagem de encerramento
				System.out.println(">>> Obrigado.");
			}
		} while (operacao != 9); // enquanto usuario optar por nao encerrar 
	}
}
