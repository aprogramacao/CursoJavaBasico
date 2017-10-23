/*
 * Construir um programa Java que receba como entrada:
 * • a idade e a altura de várias pessoas.
 * E que deverá fornecer como saída:
 * • o total de pessoas com mais de 50 anos;
 * • a média das alturas das pessoas com mais de 50 anos;
 * • o total de pessoas com idades entre 18 e 50 anos;
 * • a média das alturas das pessoas com idades entre 18 e 50 anos.
 */
package org.itstep.aula2.homework;
import java.util.Scanner;
public class EstatisticaAlturasPorIdades {
	public static void main(String[] args) {
		// processador da console de entrada
		Scanner entrada = new Scanner(System.in);
		// variável para idades e alturas, terminada com o número zero.
		int idade = 0;
		double altura = 0.0;
		// o total de pessoas com mais de 50 anos
		int totalPessoasMais50 = 0;
		// a média das alturas das pessoas com mais de 50 anos
		double mediaAlturasPessoasMais50 = 0.0;
		// o total de pessoas com idades entre 18 e 50 anos
		int totalPessoasEntre18e50 = 0;
		// a média das alturas das pessoas com idades entre 18 e 50 anos
		double mediaAlturasPessoasEntre18e50 = 0.0;
		// entrada da idade
		System.out.println("Informe a idade: ");
		idade = entrada.nextInt();
		// loop para processar todos os números da entrada 
		while (idade > 0) { // enquanto idade marior que zero
			// entrada da altura
			System.out.println("Informe a altura: ");
			altura = entrada.nextDouble();
			if (idade > 50) { // caso idade maior 50
				// contabilidade pessoa com idade maior 50
				totalPessoasMais50++;
				// contabilidade altura da pessoa com idade maior 50
				mediaAlturasPessoasMais50 += altura;
			} else if (idade > 18) { // caso idade maior 18 e menor 50
				// contabilidade pessoa com idade entre 18 e 50
				totalPessoasEntre18e50++;
				// contabilidade altura da pessoa com idade entre 18 e 50
				mediaAlturasPessoasEntre18e50 += altura;
			}
			// entrada da idade
			System.out.println("Informe a idade da próxima pessoa: ");
			idade = entrada.nextInt();
		}
		// o total de pessoas com mais de 50 anos
		System.out.println("O total de pessoas com mais de 50 anos: " + totalPessoasMais50);
		// a média das alturas das pessoas com mais de 50 anos
		mediaAlturasPessoasMais50 /= totalPessoasMais50;
		System.out.println("A média das alturas das pessoas com mais de 50 anos: " + mediaAlturasPessoasMais50);
		// o total de pessoas com idades entre 18 e 50 anos
		System.out.println("O total de pessoas com idades entre 18 e 50 anos: " + totalPessoasEntre18e50);
		// a média das alturas das pessoas com idades entre 18 e 50 anos
		mediaAlturasPessoasEntre18e50 /= totalPessoasEntre18e50;
		System.out.println("A média das alturas das pessoas com idades entre 18 e 50 anos: " + mediaAlturasPessoasEntre18e50);
	}
}
