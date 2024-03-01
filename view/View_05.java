package view;

import java.util.Scanner;

import controller.Controller_05;

public class View_05 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Controller_05 cont = new Controller_05();
		int num = 0;

		while (num <= 0) {
			System.out.println("Digite um numero inteiro maior que 0");
			num = ler.nextInt();
		}
		System.out.println("Resultado da somatoria " + cont.somaSequencia(num));
	}
}
