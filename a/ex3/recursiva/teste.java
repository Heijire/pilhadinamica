package recursiva;

import br.edu.fateczl.pilha.PilhaInt;

public class teste {
	public static void main(String []args){
		PilhaInt pilhaA = new PilhaInt();
		PilhaInt pilhaB = new PilhaInt();
		PilhaInt pilhaAuxiliar = new PilhaInt();
		int temporario = 0;
		int[] vetor = {5, 26, 1, 17, 20, 22, 25,11, 39, 5, 15, 38, 26, 14};
		for (int i = 0 ; i < vetor.length ; i++) {
			pilhaAuxiliar.push(vetor[i]);
			try {
				System.out.println(pilhaA.top());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0 ; i < vetor.length; i++) {
			try {
				pilhaAuxiliar.push(pilhaA.pop());
				System.err.println(pilhaAuxiliar.top());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
		
		while(!pilhaAuxiliar.isEmpty()) {
			try {
				temporario = pilhaAuxiliar.top();
				if(temporario% 2 == 0) {
					pilhaA.push(pilhaAuxiliar.pop());
					System.out.println("PILHA=>A = " + pilhaA.top());
				} else {
					pilhaB.push(pilhaAuxiliar.pop());
					System.out.println("PILHA=>B = " + pilhaB.top());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
