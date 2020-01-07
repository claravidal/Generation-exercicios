package com.javageneration.numseforpositivo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		int num;
		boolean vf = false;
		Scanner ler = new Scanner(System.in);
		
		
		do {
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		
		
		if (num >= 0) {
			System.out.println("O número " + num + " é positivo ");
		}
		else {
			System.out.println("O número " + num + " é negativo ");
	
		}
		
		System.out.println("Deseja verificar outro número: 1- yes/ 2-  No ");
		num = ler.nextInt();
		
		
		}
		while(num == 1);
		
		ler.close();
	}
	
}
