package Familia28;

import java.util.Scanner;

// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
public class L3JavaExercicio2 {

	public static void main(String[] args) {
		
		
		int x, num, numPar=0, numImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1; x<=10; x++) {
			
			System.out.println("\nEntre com um numero: ");
			num = leia.nextInt();
			
			if(num % 2==0) {
				num = numPar++;
				
			} else {
				num = numImpar++;
			}
				
			
			}
		System.out.println("\nN�meros Pares: " + numPar);
		System.out.println("\nN�meros Impares: " + numImpar);

	}

}
