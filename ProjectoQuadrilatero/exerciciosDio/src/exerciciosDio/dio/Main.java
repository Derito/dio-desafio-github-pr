package exerciciosDio.dio;

public class Main {

	public static void main(String[] args) {
		
		//Calculos matematicos
		
		int soma = OpcoesMatmaticas.soma(3, 5);
		System.out.println("A soma de 3 e 5 � ="+soma);
	
		int subtracao = OpcoesMatmaticas.subtracao(3, 5);
		System.out.println("A subtra��o de 3 e 5 � ="+subtracao);
		
		int multiplicacao = OpcoesMatmaticas.multiplicacao(3, 5);
		System.out.println("A multiplica��o de 3 e 5 � ="+multiplicacao);
		
		double divisao = OpcoesMatmaticas.divisao(3, 5);
		System.out.println("A divisao de 3 e 5 � ="+divisao);
//		
// Calculo de areas
		double areaQuadrante = Quadrilatero.area(3);
		System.out.println("Area do quadrado: " + areaQuadrante);
		
		double areaRetangulo = Quadrilatero.area(5, 5);
		System.out.println("Area do retangulo: " + areaRetangulo);

		double areaTrapezio = Quadrilatero.area(7, 8, 9);
		System.out.println("Area do Trapezio: " + areaTrapezio);
		
		// Calculo Hora do dia
		
	   HoraDia horaDia = new HoraDia();
	   horaDia.horaDoDia();
	   
	   Emprestimo emp = new Emprestimo();
	   emp.emprestimoTaxa();
	}

}
