package lacosCondicionais;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int proat, trab;
		
		System.out.print("Digite sua nota de proatividade: ");
		proat = sc.nextInt();
		
		System.out.print("Digite sua nota de trabalho em equipe: ");
		trab = sc.nextInt();
		
		System.out.print("\nÉ preciso ter as duas nota 4 (Operador lógico E)");
		if (proat == 4 && trab == 4) { //operador lógico E = ambas condições precisam ser verdadeiras para executar
			System.out.println("\nParabéns! Duas notas 4!");
		} else {
			System.out.println("\nSinto muito, você não possui duas nota 4");
		}
		
		System.out.print("\nÉ preciso ter as duas nota 4 (Operador lógico OU)");
		if (proat == 4 || trab == 4) { //operador lógico OU = apenas uma condição precisa ser verdadeiras para executar
			System.out.println("\nParabéns! você obteve pelo menos uma nota 4!");
		} else {
			System.out.println("\nSinto muito, você não possui duas nota 4");
		}
		
		sc.close();
	}

}
