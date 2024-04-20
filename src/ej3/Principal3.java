package ej3;

import java.util.Scanner;

public class Principal3 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] words = new String [10];
		String word = "";
		System.out.println("Ingrese 10 palabras: ");
		
		//Leer las palabras
		
		for(int i = 0; i  < 10; i++) {
			words[i] = scanner.next();
		}
		System.out.println("Ingrese una palabra: ");
		word = scanner.next();
		
		for(int i = 0; i < 10; i++) {
			if (words[i].equals (word)) {
				System.out.println("La palabra ingresada coincide con una en el arreglo: "+words[i]);
			}		
		}
		
		scanner.close();
	}
}

