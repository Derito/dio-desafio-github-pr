package exerciciosDio.dio;

import java.util.Scanner;

public class Emprestimo {

	public void emprestimoTaxa() {

		Scanner scan = new Scanner(System.in);
		double emprestimo = scan.nextDouble();

		while (scan.hasNext()) {

			if (emprestimo >= 100 && emprestimo < 1000) {
				double valorEmpr = emprestimo + (emprestimo * 0.10);
				System.out.println("Valor emtrestimo é:" + valorEmpr);
				break;
			} else if (emprestimo >= 50 && emprestimo < 500) {
				double valorEmpr = emprestimo + (emprestimo * 0.5);
				System.out.println("Valor emtrestimo é:" + valorEmpr);
				break;
			} else {

				System.out.println("Emprestimo não existente");
				break;
			}
		}
	}
}
