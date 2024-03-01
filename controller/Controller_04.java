package controller;

public class Controller_04 {

	public Controller_04() {
		super();
	}

	public int qtdNegativos(int[] vet, int tamanho) {

		// condição de parada: quando o tamanho do vetor for 0
		if (tamanho == 0) {
			return 0;
		} else {
			// a cada volta é somado 1 ao retorno caso o numero no vetor seja negativo,
			// enquando a função é chamada com o tamanho menos 1
			if (vet[tamanho - 1] < 0) {
				return 1 + qtdNegativos(vet, tamanho - 1);
			} else
				return qtdNegativos(vet, tamanho - 1);
		}
	}
}
