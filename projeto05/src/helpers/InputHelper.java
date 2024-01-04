package helpers;

import java.util.Scanner;

@SuppressWarnings("resource")
public class InputHelper {

	public static Integer lerId(String mensagem) {
		System.out.print(mensagem);
		Scanner scanner = new Scanner(System.in);
		return Integer.parseInt(scanner.nextLine());
	}
	
	public static String lerTexto(String mensagem) {
		System.out.print(mensagem);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
}
