package recursiva;

import br.edu.fateczl.pilha.PilhaInt;

public class FatController {

	public int fatorial(int valor) {
		PilhaInt pilha = new PilhaInt();
		int resultado = 1;
		int auxilio = valor;
		do {
			pilha.push(auxilio);
			auxilio--;
		} while(auxilio > 0);
		
		for(int i = valor; i >= 1; i--) {
			try {
				System.err.println(pilha.top());
				resultado = resultado * pilha.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultado;
	}
}
