package controller;

public class Controller_03 {

	
	public Controller_03() {
		super();
	}

	public int Fatorial(int numero) {
		
		// condição de parada: quando o numero passado for igual a 0
		if (numero == 0) {
			return 1;
		} else {
			// a cada volta o numero passado é multiplicado, enquanto a função é retornada com o numero menos 1 
			return numero * Fatorial(numero - 1);
		}
	}
}
