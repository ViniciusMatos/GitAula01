import javax.swing.JOptionPane;

public class Exemplo {
	public static void main(String args[]) {
		
		System.out.println("Hello World");
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade"));
		
		System.out.println("Idade do usuário" +idade);
	}

}
