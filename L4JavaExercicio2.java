package Familia28;

import java.util.Scanner;

/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.
 */

public class L4JavaExercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [] vetorzin = new int[6];
		int linha; 
		int somaPar=0, quantImpar=0;
		int x;
		
		for(linha =0; linha<6; linha++) {
		
				System.out.println("\nEntre com um n�mero: ");
				vetorzin[linha] = leia.nextInt();
		}
		for(linha =0; linha<6; linha++) {
			if(vetorzin[linha] % 2 ==0) {
				System.out.println("\n" + vetorzin[linha] + " � Par!!!");
				somaPar = somaPar + vetorzin[linha];
				/*for(x=0; x<6; x++) {
					vetorzin[x] = leia.nextInt();
					
					somaPar = somaPar + vetorzin[x];
					
					System.out.println("\nA soma dos numeros pares �: " + somaPar);
				}*/
			}
			else {
				quantImpar++;
				
				System.out.println("\n" + vetorzin[linha] + " � Impar ");
				//System.out.println("\n" + vetorzin[linha] + " � Impar!!!");
				
				
				/*for(x=0; x<6; x++) {
					vetorzin[x] = leia.nextInt();
					
					somaImpar = somaImpar + vetorzin[x];
					
					System.out.println("\nA soma dos numeros pares �: ");
				}*/
			}
			
		}
		System.out.println("\nSoma dos n�meros pares: " + somaPar);
		System.out.println("\nQuantidade de n�meros impares: " + quantImpar);

	}

}
