package repositories;

import java.io.FileWriter;
import java.io.PrintWriter;

import entities.Cliente;
import interfaces.IClienteRepository;

public class ClienteRepositoryTXT implements IClienteRepository {

	@Override
	public void exportarDados(Cliente cliente) throws Exception {
		
		PrintWriter print = new PrintWriter(new FileWriter("c:\\temp\\coti\\clientes.txt", true));
		
		print.println("Id....................: " + cliente.getId());
		print.println("Nome..................: " + cliente.getNome());
		print.println("Cpf...................: " + cliente.getCpf());
		print.println("Email.................: " + cliente.getEmail());
		print.println("Logradouro............: " + cliente.getEndereco().getLogradouro());
		print.println("Complemento...........: " + cliente.getEndereco().getComplemento());
		print.println("Número................: " + cliente.getEndereco().getNumero());
		print.println("Bairro................: " + cliente.getEndereco().getBairro());
		print.println("Cidade................: " + cliente.getEndereco().getCidade());
		print.println("Estado................: " + cliente.getEndereco().getEstado());
		print.println("Cep...................: " + cliente.getEndereco().getCep());
		print.println("-------------------------------------------------------------");
		
		print.flush();
		print.close();
	}

}
