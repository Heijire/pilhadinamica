package recursiva;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		int numero = 0;
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inbteiro de 0 a 10"));
			
		} while(numero > 10 || numero < 0);
		FatController fat = new FatController();
		int resultado = fat.fatorial(numero);
		System.out.println("O fatorial de " + numero + " é igual a " + resultado + ". ");
	}
}
