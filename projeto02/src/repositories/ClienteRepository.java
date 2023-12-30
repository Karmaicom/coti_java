package repositories;

import java.io.File;
import java.io.PrintWriter;

import entities.Cliente;

public class ClienteRepository {

	public void exportarDados(Cliente cliente) throws Exception {
		
		File file = new File("C:\\Temp\\projeto02\\cliente.txt");
		PrintWriter print = new PrintWriter(file);
		
		print.write("\nId...............: " + cliente.getId());
		print.write("\nNome.............: " + cliente.getNome());
		print.write("\nTelefone.........: " + cliente.getTelefone());
		print.write("\nEmail............: " + cliente.getEmail());
		
		print.flush();
		print.close();
	}
	
}
