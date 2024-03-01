package controller;

public class Controller_05 {

	public Controller_05() {
		super();
	}

	public double somaSequencia(int num) {
		// condição de parada: quando num for igual a 0
		if (num == 0) {
			return 0;
		} else {
			double r = 1 / (double) num;
			// a cada volta r é somado ao retorno, enquanto a função é chamada com num - 1 como parãmetro
			return r + somaSequencia(num - 1);
		}

	}
}
