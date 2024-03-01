package controller;

public class Controller_02 {

	public Controller_02() {
		super();
	}

	public int MenorValor(int[] vet, int tamanho, int menorValor) { //

		// condição de parada: quando a o tamanho do vetor for igual a 0
		if (tamanho == 0)
			return menorValor;
		else {
			
			if (vet[tamanho - 1] < menorValor) {
				menorValor = vet[tamanho - 1];
			}
			// a cada volta a função é retornada com o tamanho do vetor menos 1
			return MenorValor(vet, tamanho - 1, menorValor);
		}
	}
}
