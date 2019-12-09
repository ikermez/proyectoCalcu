package elorrieta.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola, este es mi proyecto");
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una crifra");
		int num= sc.nextInt();
		System.out.println("Dame otra");
		int num2= sc.nextInt();
		int resultado = num + num2;
		
		System.out.println("Resultado: "+ resultado);
	}

}
