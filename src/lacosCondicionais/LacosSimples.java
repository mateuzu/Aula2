package lacosCondicionais;

import java.util.Scanner;

public class LacosSimples {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		if (num == 1) {
			System.out.print("Conta paga no débito!"); //executa quando verdadeiro
		} else if (num == 2) {
			System.out.print("Conta paga no crédito!"); //executa quando verdadeiro, quando a primeira condição = falso
		}else {
			System.out.print("Número inválido"); //executa quando falso
		}
		
		sc.close();
	}

}
