package Familia28;

import java.util.Scanner;

/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

public class L2JavaExercicio4 {

	public static void main(String[] args) {

		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um n�mero: ");
		num = leia.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("\n" + num +  " � Par! " + "\nE sua raiz quadrada �: " + Math.sqrt(num));
			
		}
		
		else 
		{
			System.out.println("\n" + num +  " � Impar! " + "\nE sua pot�ncia �: " + Math.pow(num, 2));
			
		}
		

	}

}
