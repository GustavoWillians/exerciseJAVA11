import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o codigo do item que você pegou, codigos entre 1 e 5");
	
		int item = sc.nextInt();
		
		System.out.println("Insira a quantidade do item que você levou:");
		
		int quantidade = sc.nextInt();
		
		
		if (item == 1) {
			System.out.println("Voce comprou " + quantidade + " cachorros quentes por R$" + quantidade*4.00);
		}
		else if (item == 2) {
			System.out.println("Voce comprou " + quantidade + " X-Salada quentes por R$" + quantidade*4.50);
		}
		else if (item == 3) {
			System.out.println("Voce comprou " + quantidade + " X-Bacon quentes por R$" + quantidade*5.00);
		}
		else if (item == 4) {
			System.out.println("Voce comprou " + quantidade + " Torrada simples quentes por R$" + quantidade*2.00);
		}
		else if (item == 5) {
			System.out.println("Vocw comprou " + quantidade + " Refrigerante quentes por R$" + quantidade*1.50);
		}
		

	}

}
