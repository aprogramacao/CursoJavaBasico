/*
 * Construir um programa Java que receba como entrada:
 * • uma lista de números positivos ou negativos, terminada com o número zero.
 * E que deverá fornecer como saída:
 * • a soma dos números positivos;
 * • a soma dos números negativos;
 * • a soma das duas somas anteriores.
 */
package org.itstep.aula2.homework;
import java.util.Scanner;
public class SomaNumerosPositivosNegativos {
	public static void main(String[] args) {
		// processador da console de entrada
		Scanner entrada = new Scanner(System.in);
		// variável para números positivos ou negativos, terminada com o número zero.
		double numero = 0.0;
		// a soma dos números positivos
		double somaPositivos = 0.0;
		// a soma dos números negativos
		double somaNegativos = 0.0;
		// a soma das duas somas anteriores
		double somaTotal = 0.0;
		// loop para processar todos os números da entrada 
		do {
			// entrada do número
			System.out.println("Informe um número real: ");
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

		// a soma dos números positivos
		System.out.println("Soma dos positivos: " + somaPositivos);
		// a soma dos números negativos
		System.out.println("Soma dos negativos: " + somaNegativos);
		// a soma das duas somas anteriores
		System.out.println("Soma das parciais: " + somaTotal);
	}
}
