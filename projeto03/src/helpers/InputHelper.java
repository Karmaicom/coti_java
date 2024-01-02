package helpers;

import java.util.Scanner;

@SuppressWarnings("resource")
public class InputHelper {

	public static Integer lerId(String mensagem) {
		System.out.print(mensagem);
		Scanner scan = new Scanner(System.in);
		return Integer.parseInt(scan.nextLine());
	}
	
	public static String lerTexto(String mensagem) {
		System.out.print(mensagem);
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();		
	}
}
