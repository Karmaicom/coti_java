package helpers;

import java.util.Scanner;

@SuppressWarnings("resource")
public class InputHelper {
	
	public static Integer lerNumeroInteiro(String mensagem) {
		System.out.print(mensagem);
		Scanner scn = new Scanner(System.in);
		return Integer.parseInt(scn.nextLine());
	}

	public static String lerTexto(String mensagem) {
		System.out.print(mensagem);
		Scanner scn = new Scanner(System.in);
		return scn.nextLine();
	}
	
}
