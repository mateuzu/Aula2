package lacosCondicionais;

import java.util.Scanner;

public class LacoSwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean persistencia;
		int opcao;
		
		System.out.print("Digite 1 para verificar sua persistência ou 2 para sair: ");
		opcao = sc.nextInt();
		
		switch(opcao) { //escolha - caso
		case 1: //caso opcao = 1 executa o bloco abaixo
			System.out.print("Se você estiver tendo persistêcia, digite true, caso não esteja digite false: ");
			persistencia = sc.nextBoolean();
			if (persistencia != true) {
				System.out.println("\nPor falta de persistência, você não conseguiu se formar!");
			}
			else {
				System.out.print("\nPor demonstrar muita persistência, você conseguiu se formar!");
			}
			break; //interrompe a execucao do caso 1
			
		case 2:
			System.out.print("\nVolte sempre!");
			break;
			
		default:
			System.out.println("\nOpção inválida");
		}
		
		
		
		sc.close();
	}

}
