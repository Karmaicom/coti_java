package repositories;

import java.io.File;
import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {

public void exportarDados(Funcionario funcionario) throws Exception {
		
		File file = new File("C:\\Temp\\projeto02\\funcionario.txt");
		PrintWriter print = new PrintWriter(file);
		
		print.write("\nId...............: " + funcionario.getId());
		print.write("\nNome.............: " + funcionario.getNome());
		print.write("\nMatricula........: " + funcionario.getMatricula());
		print.write("\nCpf..............: " + funcionario.getCpf());
		
		print.flush();
		print.close();
	}
	
}
