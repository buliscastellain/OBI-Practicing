import java.util.Scanner;

public class plano {

	public static void main(String[] args) {
		try (Scanner leitor = new Scanner(System.in)) {

			int quotaMensal = leitor.nextInt();
			int qtdMeses = leitor.nextInt();

			int qtdUtilizadaMes = 0;			
			int qtdDisponivel = quotaMensal;

			for (int i = 0; i < qtdMeses; i++) {
				qtdUtilizadaMes = leitor.nextInt();			
				qtdDisponivel += (quotaMensal - qtdUtilizadaMes);								
			}

			System.out.println(qtdDisponivel);

		}

	}

}
