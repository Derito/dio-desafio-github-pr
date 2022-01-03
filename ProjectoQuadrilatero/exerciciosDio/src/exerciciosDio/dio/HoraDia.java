package exerciciosDio.dio;

import java.util.Scanner;

public class HoraDia {

	public void horaDoDia() {
		Scanner scan = new Scanner(System.in);
		 int A = scan.nextInt();
		while (scan.hasNext()) {

			if (A >= 0 && A < 90 || A == 360) {
				System.out.println("Bom dia!");
				break;
			} else if (A >= 270 && A < 360) {
				System.out.println("Bom tarde!");
				break;
			} else if (A >= 180 && A < 270) {
				System.out.println("Bom noite!");
				break;
			} else {
				System.out.println("É Madrugada!");
				break;
			}
		}
	}
}
