package exerciciosIfElse;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String anatomia, classe, ordem;
		
		System.out.print("Informe se o animal é invertebrado ou vertebrado? ");
		anatomia = sc.next();
		System.out.print("Informe a classe do animal: ");
		classe = sc.next();
		System.out.print("Informe a ordem do animal: ");
		ordem = sc.next();
		
		//vertebrados
		if(anatomia.equals("vertebrado") && classe.equals("ave") && ordem.equals("carnivoro")) {
			System.out.println("\nÁguia");
		} else if (anatomia.equals("vertebrado") && classe.equals("ave") && ordem.equals("onivoro")) {
			System.out.println("\nPomba");
		} else if (anatomia.equals("vertebrado") && classe.equals("mamifero") && ordem.equals("onivoro")) {
			System.out.println("\nHomem");
		} else if (anatomia.equals("vertebrado") && classe.equals("mamifero") && ordem.equals("herbivoro")){
			System.out.println("\nVaca");
		}
		
		//invertebrados
		if (anatomia.equals("invertebrado")){
			if (classe.equals("inseto")) {
				if (ordem.equals("hematofago")) {
					System.out.println("\nPulga");
				} else if (ordem.equals("herbivoro")) {
					System.out.println("\nLagarta");
				}
			}
			else if (classe.equals("anelideo")) {
				if (ordem.equals("hematofago")) {
					System.out.println("\nSanguessuga");
				} else if (ordem.equals("onivoro")) {
					System.out.println("\nMinhoca");
				}
			}
		}
		
		sc.close();

	}

}
