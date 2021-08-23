package Abstract;

import java.util.ArrayList;

import java.util.Locale;
import java.util.Scanner;

import entidades.TaxPayer;
import entidades.Individual;
import entidades.Company;

public class ProgramPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
			ArrayList<TaxPayer> lista = new ArrayList<>();
			try {
				Scanner entrada = new Scanner(System.in);

				System.out.println("Enter the number of tax payers: ");

				int n = entrada.nextInt();
				for (int i = 1; i <= n; i++) {
					System.out.println("Taxer payer #" + i + "data");
					System.out.println("Individual or Company (I/C): ");
					char ch = entrada.next().charAt(0);

					System.out.println("Name: ");
					entrada.next();
					String name = entrada.nextLine();

					System.out.println("Anual income: ");
					double anualIncome = entrada.nextDouble();

					if (Character.toUpperCase(ch) == 'I') {

						System.out.println("health expenditures: ");
						double healthExpenditures = entrada.nextDouble();
						lista.add(new Individual(name, anualIncome, healthExpenditures));
					} else {

						System.out.println("Number of Employess: ");
						int NumberEmployess = entrada.nextInt();
						lista.add(new Company(name, anualIncome, NumberEmployess));

					}

				}
				entrada.close();
			} catch (Exception ex) {
				System.err.println("Erro no Programa!"+ ex.getLocalizedMessage());
			}finally {
				System.out.println("Programa Finalizado");
			}
			

			double total = 0.0;
			System.out.println("TAXES PAID:");
			for (TaxPayer taxPayer : lista) {

				double txp = taxPayer.tax();
				System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", txp));
				total += txp;
			}
			System.out.println();
			System.out.println("TOTAL TAXES: $ " + String.format("%.2f", total));
			//
		}

	}

