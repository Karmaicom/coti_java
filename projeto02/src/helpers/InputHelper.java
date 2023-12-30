package helpers;

import javax.swing.JOptionPane;

public class InputHelper {
	
	public static Integer lerId (String mensagem) {
		String id = JOptionPane.showInputDialog(mensagem);
		return Integer.parseInt(id);
	}
	
	public static String lerTexto (String mensagem) {
		return JOptionPane.showInputDialog(mensagem);
	}
	
}
