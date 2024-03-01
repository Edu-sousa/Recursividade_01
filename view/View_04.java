package view;

import java.util.Scanner;

import controller.Controller_04;

public class View_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controller_04 cont = new Controller_04();

		System.out.println("Insira o tamanho do vetor");
		int tamanho = sc.nextInt();

		int[] vet = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			System.out.println("Posição " + (i + 1) + " de " + tamanho);
			vet[i] = sc.nextInt();
		}
		
		System.out.println("Quantidade de Numeros Negativos: " + cont.qtdNegativos(vet, tamanho));
	}
}
