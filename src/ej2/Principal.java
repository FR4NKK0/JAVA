package ej2;

import java.util.Scanner;

public class Principal {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] words = new String [10];
		
		System.out.println("Ingrese 10 palabras: ");
		
		//Leer las palabras
		
		for(int i = 0; i  < 10; i++) {
			words[i] = scanner.next();
		}
		
		
		System.out.println("Palabras en orden inverso: ");
		for(int i = 9; i  >= 0; i--) {
			System.out.println(words[i]);
		}
		
		scanner.close();
	}
}
