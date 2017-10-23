/*
 * Construir um programa Java que receba como entrada:
 * � uma lista de n�meros positivos ou negativos, terminada com o n�mero zero.
 * E que dever� fornecer como sa�da:
 * � a soma dos n�meros positivos;
 * � a soma dos n�meros negativos;
 * � a soma das duas somas anteriores.
 */
package org.itstep.aula2.homework;
import java.util.Scanner;
public class SomaNumerosPositivosNegativos {
	public static void main(String[] args) {
		// processador da console de entrada
		Scanner entrada = new Scanner(System.in);
		// vari�vel para n�meros positivos ou negativos, terminada com o n�mero zero.
		double numero = 0.0;
		// a soma dos n�meros positivos
		double somaPositivos = 0.0;
		// a soma dos n�meros negativos
		double somaNegativos = 0.0;
		// a soma das duas somas anteriores
		double somaTotal = 0.0;
		// loop para processar todos os n�meros da entrada 
		do {
			// entrada do n�mero
			System.out.println("Informe um n�mero real: ");
			numero = entrada.nextDouble();
			if (numero > 0.0) {
				// caso numero positivo
				somaPositivos += numero;
			} else if (numero < 0.0) {
				// caso numero negativo
				somaNegativos += numero;
			}
			// soma de todos os parciais
			somaTotal += numero;
		} while (numero != 0.0); // enquanto entrada diferente de zero

		// a soma dos n�meros positivos
		System.out.println("Soma dos positivos: " + somaPositivos);
		// a soma dos n�meros negativos
		System.out.println("Soma dos negativos: " + somaNegativos);
		// a soma das duas somas anteriores
		System.out.println("Soma das parciais: " + somaTotal);
	}
}
