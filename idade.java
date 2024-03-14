// idade da irmã do meio

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		try (Scanner leitor = new Scanner(System.in)) {

			int idade01 = validarIdade(leitor);
			int idade02 = validarIdade(leitor);
			int idade03 = validarIdade(leitor);

			int idadeCamila = retornarNumeroIntermediario(idade01, idade02, idade03);

			System.out.print(idadeCamila);
		}
	}

	public static int retornarNumeroIntermediario(int n01, int n02, int n03) {
		if (n01 > n02 && n01 < n03)
			return n01;
		else if (n02 > n01 && n02 < n03)
			return n02;
		else
			return n03;
	}

	public static int validarIdade(Scanner leitor) {
		int idade = 0;
		boolean idadeValida = false;

		while (!idadeValida) {
			idade = leitor.nextInt();
			if (idade >= 5 && idade <= 100) {
				idadeValida = true;
			} else {
				System.out.println("Idade inválida. Digite novamente.");
			}
		}
		return idade;
	}

}
