package Excecoes;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Scanner;



public class Arquivos {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Pierre\\Documents\\java\\p3.txt");

		Scanner sc = null;

		try {

			sc = new Scanner(file); 

			while (sc.hasNextLine()) {

				System.out.println(sc.nextLine());

			}

		} catch (FileNotFoundException e) {

			System.out.println("Erro ao abrir o arquivo ");

		}



//		} catch (IOException e) {

//			System.out.println("Error opening file: " + e.getMessage());

//		}

		finally {

			if (sc != null) {// fechar o arquivo, para não deixar ele aberto

				System.out.println("Fecha!!");

				sc.close();

			}

			 System.out.println("Finalizando o Bloco");

		}

	}

}