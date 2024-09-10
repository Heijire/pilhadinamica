package recursiva;

import br.edu.fateczl.pilha.PilhaInt;

public class exercicio5 {

	public static void main(String []args){
		PilhaInt pilha = new PilhaInt();
		int x, y;
		int[] vetor = {1, 17, 20, 22, 25,11, 39, 5, 15, 38, 26, 14};
		for (int i = 0 ; i < vetor.length ; i++) {
			try {
				pilha.push(vetor[i]);
				System.out.println(pilha.top());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		while(pilha.size()> 1) {
			try {
				System.out.println("===========================================");
				x = pilha.pop();
				System.err.print(x);
				System.out.print(" vs ");
				y= pilha.pop();
				System.err.print(y);
				System.out.println();
				if(x < y) {
					pilha.push(y);
				} else {
					pilha.push(x);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			System.out.println("===========================================");
			System.out.println(pilha.top());
			System.out.println("===========================================");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
