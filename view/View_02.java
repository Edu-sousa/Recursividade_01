package view;

import java.util.Scanner;

import controller.Controller_02;

public class View_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controller_02 cont = new Controller_02();

		System.out.println("Insira o tamanho do vetor");
		int tamanho = sc.nextInt();

		int[] vet = new int[tamanho];
		int primeiroValor = 0;

		for (int i = 0; i < tamanho; i++) {
			System.out.println("Posição " + (i + 1) + " de " + tamanho);
			vet[i] = sc.nextInt();
			primeiroValor = vet[0];
		}
		System.out.println("Menor valor desse vetor : " + cont.MenorValor(vet, tamanho, primeiroValor));
	}
}
