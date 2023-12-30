package principal;

import javax.swing.JOptionPane;

import entities.Cliente;
import entities.Funcionario;
import helpers.InputHelper;
import repositories.ClienteRepository;
import repositories.FuncionarioRepository;

public class Program {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Funcionario funcionario = new Funcionario();
		
		try {
			
			JOptionPane.showMessageDialog(null, "Olá!\nPrimeiro entre com os dados do cliente no sistema");
			cliente.setId(InputHelper.lerId("Informe o Id do cliente:"));
			cliente.setNome(InputHelper.lerTexto("Informe o nome do cliente:"));
			cliente.setTelefone(InputHelper.lerTexto("Informe o telefone do cliente:"));
			cliente.setEmail(InputHelper.lerTexto("Informe o email do cliente:"));

			JOptionPane.showMessageDialog(null, "Olá!\nAgora entre com os dados do funcionário no sistema");
			funcionario.setId(InputHelper.lerId("Informe o Id do funcionário:"));
			funcionario.setNome(InputHelper.lerTexto("Informe o nome do funcionário:"));
			funcionario.setCpf(InputHelper.lerTexto("Informe o cpf do funcionário:"));
			funcionario.setMatricula(InputHelper.lerTexto("Informe a matrícula do funcionário:"));
			funcionario.setTipoContratacao(InputHelper.lerTipoContratacao("Informe o tipo de contratação:"));
			
			ClienteRepository clienteRepository = new ClienteRepository();
			clienteRepository.exportarDados(cliente);
			
			FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarDados(funcionario);
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}
