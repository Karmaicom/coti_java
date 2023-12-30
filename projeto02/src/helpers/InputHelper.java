package helpers;

import javax.swing.JOptionPane;

import enums.TipoContratacao;

public class InputHelper {
	
	public static Integer lerId (String mensagem) {
		String id = JOptionPane.showInputDialog(mensagem);
		return Integer.parseInt(id);
	}
	
	public static String lerTexto (String mensagem) {
		return JOptionPane.showInputDialog(mensagem);
	}
	
	public static TipoContratacao lerTipoContratacao(String mensagem) {
		Integer opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe (1)CLT, (2)Estagio, (3)Terceirizado"));
		
		switch (opcao) {
			case 1:
				return TipoContratacao.CLT;
			case 2:
				return TipoContratacao.ESTAGIO;
			case 3:
				return TipoContratacao.TERCEIRIZADO;
			default:
				return null;
		}
	}
}
