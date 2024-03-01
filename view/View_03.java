package view;

import java.util.Scanner;

import controller.Controller_03;

public class View_03 {

	public class FatorialView {

		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			Controller_03 fat = new Controller_03();

			int numero = -1;

			while (numero < 0 || numero > 20) {
				System.out.println("Digite um numero de 0 a 12");
				numero = ler.nextInt();
			}
			System.out.println("O fatorial de " + numero + " é : " + fat.Fatorial(numero));
		}
	}
}
