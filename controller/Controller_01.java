package controller;

public class Controller_01 {

	public Controller_01() {
		super();
	}

	public int SomaNaturais(int numeros) {

		// condição de parada: quando a variavel numero for menor que 0, não sendo mais
		// um numero natural
		if (numeros < 0)
			return 0;
		else
			// a cada volta na função a variavel numero sera somada, chamando a função
			// SomaNaturais, subtraindo 1 da variavel numeros
			return numeros + SomaNaturais(numeros - 1);
	}
}
