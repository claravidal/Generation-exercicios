package com.generation.conversaorealdolar;

import java.util.Scanner;

/**
 * Exercicio de conversão de moedas
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner conversao  = new Scanner(System.in);
    	
    	System.out.println("Digite a cotação do dólar: ");
    	float dolarDia = conversao.nextFloat();
        
        System.out.println("Digite o valor em dólar:  ");
        float valorDolar= conversao.nextFloat();
        
        float valorReal = dolarDia*valorDolar;
        
        System.out.printf(" O valor em reais é  de: " + valorReal);
    }
}
