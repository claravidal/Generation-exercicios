package com.javageneration.exerciciosocio;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Socio cliente = new Socio("Clara", "39595807899", "464584379", "19/05/90", "989276544",
				"R Cordeiro  de la Cunha");

		Produto tv = new Produto(1, "TV Samsung", "tv 29 polegadas", (float) 599.99, (float) 899.99, 15, true,
				"08/01/2010");

		System.out.println("Nome do Sócio: " + cliente.getNome() +
				"\nData de cadastro: " + tv.getDataCadastro()+ 
				"\nId do produto comprado: " + tv.getCodigo() + 
				"\nProduto comprado: " + tv.getNome()+ 
				"\nValor pago: R$ " + tv.getPrecoVenda() + 
				"\nDisponível no estoque: " + tv.getQtdeestoque());
	}
}