package Familia28;

import java.util.Scanner;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

public class L2JavaExercicio1 {

	public static void main(String[] args) {

		int a, b, c, numMaior = 0, numAnterior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um n�mero: ");
		a = leia.nextInt();
		
		System.out.println("\nEntre com outro n�mero: ");
		b = leia.nextInt();
		
		System.out.println("\nEntre com mais um n�mero: ");
		c = leia.nextInt();
		
		
		
		
		
		if(numMaior < a) 
		{
			numMaior = a;
			numAnterior = a;
			
		} 
		
		else if (numMaior < b) 
		{
			numMaior = b;
			numAnterior = b;
			
		}
		
		else 
		{
			numMaior = c;
			numAnterior = c;
		}
			
		
		
		
		
		
		System.out.println("\n " + numMaior + " � o maior numero!!!");


	}

}
