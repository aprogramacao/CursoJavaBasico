/*
Construir um programa para controle de despesas e receitas:
- Leia e imprima como entrada o salario mensal de uma pessoa;
- Leia e imprima todos os itens de despesa da pessoa, incluindo a descricao, o valor e o tipo.
- Classifique o tipo de despesa entre os tipos: 1 – fixa, 2 – variavel, 3 – temporaria.
- Calcule o total de despesas e abata do salario.
- Ao final, imprima o saldo final do salario.
NOTA: Ela pode ter despesas somente até o dinheiro acabar.
*/
package org.itstep.aula1.homework;

import java.util.Scanner;

public class ControleReceitasDespesas {

	public static void main(String[] args) {
		// processador da console de entrada
		Scanner entrada = new Scanner(System.in);
		// obter valor da receita
		System.out.println("Informe o salário do(a) trabalhador(a):");
		double salario = entrada.nextDouble();
		// variavel para controle do saldo da receita
		double saldoReceitas = salario;
		// variaveis para cada despesa
		String descricaoDespesa;
		int tipoDespesa;
		double valorDespesa;
		// contador das despesas
		int indDespesa = 1;
		// entrada da descricao da despesa
		System.out.println("Informe a despesa (" + indDespesa + ") do(a) trabalhador(a):");
		descricaoDespesa = entrada.next();
		// loop para entrada e controle das despesas e do saldo das receitas
		while ((!descricaoDespesa.toUpperCase().equals("FIM")) && (saldoReceitas > 0.0)) {
			// loop para entrada do valor da despesa
			do {
				// valor da despesa
				System.out.println("Informe o valor da despesa (" + indDespesa + ") do(a) trabalhador(a):");
				valorDespesa = entrada.nextDouble();
				// caso valor negativo ou zero
				if (valorDespesa <= 0.0) {
					System.out.println("Valor de despesa indevido.");
				// caso valor da despesa maior que o saldo disponivel
				} else if (valorDespesa > saldoReceitas) {
					System.out.println("Valor da despesa está alto demais.");
				}
			} while ((valorDespesa <= 0.0) || (valorDespesa > saldoReceitas)); // enquanto valor de despesa negativo ou zero ou maior que o saldo
			// calcular saldo apos despesa
			saldoReceitas = saldoReceitas - valorDespesa;
			// loop para entrada do tipo da despesa
			do {
				// entrada do tipo da despesa
				System.out.println("Informe o tipo da despesa (" + indDespesa + ") do(a) trabalhador(a) - 1 – fixa, 2 – variavel, 3 – temporaria:");
				tipoDespesa = entrada.nextInt();
				// verificar o tipo de despesa
				if (tipoDespesa < 1 || tipoDespesa > 3) {
					System.out.println("Tipo de despesa indevido."); break;
				}
			} while (tipoDespesa < 1 || tipoDespesa > 3); // enquanto tipo da despesa diferente de 1, 2, 3
			// apresenta a despesa
			System.out.print("Despesa (" + indDespesa + "): " + descricaoDespesa + " - " + valorDespesa + " - ");
			switch(tipoDespesa) {
			case 1: System.out.println("FIXA"); break;
			case 2: System.out.println("VARIAVEL"); break;
			case 3: System.out.println("TEMPORARIA"); break;
			}
			// incremento do contdor de despesas
			indDespesa++;
			// entrada da descricao da despesa
			System.out.println("Informe a despesa (" + indDespesa + ") do(a) trabalhador(a):");
			descricaoDespesa = entrada.next();
		}
		System.out.println("Salario do(a) trabalhador(a): " + salario);
		System.out.println("Despesa total do(a) trabalhador(a): " + (salario-saldoReceitas));
		System.out.println("Saldo final do salário do(a) trabalhador(a): " + saldoReceitas);
	}
}