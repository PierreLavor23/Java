package ExercicioLivro;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;



public class Programa_principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pierre", 19,"MASCULINO");
		p[1] = new Pessoa("Maria", 18,"Feminino");
		
		l[0] = new Livro("Apredendo java","José Da silva",300,p[0]);
		l[1] = new Livro("POO para iniciantes","Pedro paulo",500,p[1]);
		l[2] = new Livro("java avançado","Maria candida",800,p[0]);
		
		
		
		l[1].abrir();
		l[1].folhear(300);
		System.out.println(l[1].detalhes());
		*/
		Locale.setDefault(Locale.US);
		ArrayList<Pessoa> lista = new ArrayList<>();
		ArrayList<Livro> lista2 = new ArrayList<>();
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de pessoas: ");
		int n = entrada.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Name:");
			
			String name = entrada.nextLine();
			entrada.next();
			System.out.println("idade: ");
			int idade = entrada.nextInt();
			System.out.println("Sexo: ");
			String Sex = entrada.nextLine();
			entrada.next();
			
			lista.add(new Pessoa(name, idade, Sex));
		}

		System.out.println("Informe a quantidade de livros: ");
		int n2 = entrada.nextInt();
		for (int i = 1; i <= n2; i++) {
			System.out.println("LIVRO #"+ i);
			System.out.println("Titulo: ");
			String  title = entrada.nextLine();
			entrada.next();
			
			System.out.println("Autor:");
			String actor = entrada.nextLine();
			entrada.next();
			System.out.println("Total de pag: ");
			int total = entrada.nextInt();
			System.out.println("Leitor: ");
			//String leitor = entrada.nextLine();
		
			lista2.add(new Livro(title, actor, total,null));		
		}
		
	for (Livro livro : lista2) {
		System.out.println(livro.detalhes());
	}
		
		entrada.close();
	}

}
