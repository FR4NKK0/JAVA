package ej4;
import java.util.Scanner;
public class Principal4 {
	public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[] numeros = new int [20];
	int[] numerosMayores = new int[20];
	int numero;
	int cont=0;
	System.out.println("Ingrese un numero: ");
	
	numero = scanner.nextInt();
	System.out.println("Ingrese 20 numeros: ");
	for(int i = 0; i  < 20; i++) {
		numeros[i] = scanner.nextInt();
	}
	
	for(int i = 0; i  < 20; i++) {
		if (numeros[i]>numero) {
			numerosMayores[cont]= numeros[i];
			cont++;
		}
	}
	
	System.out.println("Los numeros mayores al primer numero ingresado son:  ");
	for(int i = 0; i  < cont; i++) {
		System.out.println(numerosMayores[i]);
	}
	
	
	
	scanner.close();
	}	


	
}
