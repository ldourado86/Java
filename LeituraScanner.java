package teste;

import java.util.Random;
import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
	
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome1 = leitura.nextLine();
		System.out.println("Digite sua idade: ");
		String idade1 = leitura.nextLine();
		System.out.println(nome1 + " = " + idade1);
		System.out.println("==========================");
		System.out.println("Digite seu nome: ");
		String nome2 = leitura.nextLine();

		System.out.println("Digite sua idade: ");
		String idade2 = leitura.nextLine();
		
		System.out.println(nome2 + " = " + idade2);
		int idade1int = Integer.parseInt(idade1);
		int idade2int = Integer.parseInt(idade2);
		
		if(idade1int<idade2int) {
			System.out.println(nome2 + " tem a maior idade, com " + idade2 + " anos.");
		}else {
			System.out.println(nome1 + "tem a maior idade, com " + idade1 + " anos.");
		}
	}

}
