import javax.swing.JOptionPane;

public class Matemática {

	public static void main(String[] args) {
		
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota da prova 1", "Matemática", JOptionPane.PLAIN_MESSAGE));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota da prova 2", "Matemática", JOptionPane.PLAIN_MESSAGE));
		float nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do trabalho", "Matemática", JOptionPane.PLAIN_MESSAGE));
		
		float media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		
		String resultado;
		if(media >= 7) {
			resultado = "Você foi aprovado em matemática.";
		} else if (media >= 4) {
			resultado = "Você está de recuperação em Matemática.";
		} else {
			resultado = "Você foi reprovado em Matemática.";
		}
		JOptionPane.showMessageDialog(null, "Sua média foi " + media + ". " + resultado, "Resultado", JOptionPane.PLAIN_MESSAGE);
		
	}
}
