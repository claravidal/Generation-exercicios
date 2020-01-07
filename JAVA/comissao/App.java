package com.generation.comissao;

import java.util.Scanner;

/**
 * Enunciado do exercício:
 *  Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua comissão será de 5% do total da venda e 
 * que você tem os seguintes dados: - Identificação do vendedor - Código da peça - Preço unitário da peça - Quantidade vendida.
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		Scanner comissao = new Scanner(System.in);

		System.out.println("Digite a identificação dx vendedorx: ");
		int identif = comissao.nextInt();

		System.out.println("Digite o ID da peça: ");
		int idPeca = comissao.nextInt();

		System.out.println("Digite o preço unitário da peça: ");
		float precoUnit = comissao.nextFloat();

		System.out.println("Digite a quantidade de peças vendidas: ");
		float qtdePeca = comissao.nextFloat();

		double comissaofinal = (precoUnit * qtdePeca) * 0.05;

		System.out.printf("O valor da comissão " + "dx vendedorx "+ identif +" da peça vendida número " + idPeca + " é de R$ " + comissaofinal);

	}
}
