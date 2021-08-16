package principal;

import java.util.Scanner;

import entities.Quartos;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número de quartos que deseja alugar : ");
		int num_quarto = sc.nextInt();
		
		Quartos[] qrt = new Quartos[10];
		
		//capturando informações
		for(int i=0; i<num_quarto;i++) {
			System.out.println("Aluguel " + "#"+i);
			sc.nextLine();
			System.out.println("Nome : ");
			String nome = sc.nextLine();
			System.out.println("E-mail :");
			String email = sc.nextLine();
			System.out.println("Quarto : ");	
			int numero = sc.nextInt();
			
			qrt[numero] = new Quartos (nome,email);
		}
		
		System.out.println("Quartos ocupados :");
		//informando quartos alugados
		for(int i=0;i<10;i++) {
			if(qrt[i] !=null) {
				System.out.println(i + ":" + qrt[i]);
			}
		}
	
		sc.close();
	}

}
