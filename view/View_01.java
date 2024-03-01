package view;

import java.util.Scanner;
import controller.Controller_01;

public class View_01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Controller_01 soma = new Controller_01();

		System.out.println("Digite um numero: ");
		int n = ler.nextInt();

		if (n < 0) {
			n = 0;
		}
		int resultado = soma.SomaNaturais(n);

		System.out.println("Soma do(s) " + n + "° primeiros numeros naturais : " + resultado);
	}

}
