package Familia28;

import java.util.Scanner;

/*
 * 1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
	dias e mostre-a expressa apenas em dias.
 */
 

public class L1JavaExercicio1 {

	public static void main(String[] args) {
		
		int idade, dias, meses, idadeDias, mesesDias, res;
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQuantos anos voc� tem: ");
		idade = leia.nextInt();
		
		System.out.println("\nQuantos meses voc� tem: ");
		meses = leia.nextInt();
		
		System.out.println("\nQuantos dias voc� tem: ");
		dias = leia.nextInt();
		
		idadeDias = idade*365;
		mesesDias = meses*30;
		dias = dias;
		
		res = idadeDias + mesesDias + dias;
		
		
		System.out.println("\nVoc� possui no total " + res + " dias: ");
		

	}

}


