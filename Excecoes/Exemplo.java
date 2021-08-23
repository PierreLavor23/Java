package Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println();
		String[] vect = sc.nextLine().split(" "); 
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}catch (InputMismatchException e) {
			System.out.println("entrada invalida");
			// TODO: handle exception
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nao existe está posição");
			// TODO: handle exception
		}
		System.out.println("Fim do Programa!!!");
		sc.close();


	}
	}


