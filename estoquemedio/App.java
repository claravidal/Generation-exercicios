package com.generation.estoquemedio;

import java.util.Scanner;

/**
 * Enunciado do exercício:
 * Faça um programa para calcular o estoque médio de uma peça, 
 * sendo que: ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner estoque = new Scanner(System.in);
    	
    	System.out.println("Digite a quantidade mínima: ");
        float qtdeMin = estoque.nextFloat();
        
        System.out.println("Digite a quantidade mínimia: ");
        float qtdeMax= estoque.nextFloat();
        
        float estoquemedio = (qtdeMin + qtdeMax)/2;
        
        System.out.printf(" O estoque médio é " + estoquemedio);
    }
        
    }