package repositories;

import java.io.FileWriter;
import java.io.PrintWriter;

import entities.Cliente;
import interfaces.IClienteRepository;

public class ClienteRepositoryCSV implements IClienteRepository {

	@Override
	public void exportarDados(Cliente cliente) throws Exception {
		
		PrintWriter print = new PrintWriter(new FileWriter("c:\\temp\\coti\\clientes.csv", true));
		
		String dados = cliente.getId() + ";" 
				+ cliente.getNome() + ";"
				+ cliente.getEmail() + ";"
				+ cliente.getCpf() + ";"
				+ cliente.getEndereco().getLogradouro() + ";"
				+ cliente.getEndereco().getComplemento() + ";"
				+ cliente.getEndereco().getNumero() + ";"
				+ cliente.getEndereco().getBairro() + ";"
				+ cliente.getEndereco().getCidade() + ";"
				+ cliente.getEndereco().getEstado() + ";"
				+ cliente.getEndereco().getCep();
		
		print.println(dados);
		
		print.flush();
		print.close();
	}


}
