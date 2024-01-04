package principal;

import entities.Cliente;
import entities.Endereco;
import helpers.InputHelper;
import interfaces.IClienteRepository;
import repositories.ClienteRepositoryCSV;
import repositories.ClienteRepositoryTXT;

public class Program {

	public static void main(String[] args) throws Exception {
		
		try {
			
			Endereco endereco = new Endereco(
				InputHelper.lerId("Informe o id do endereço.......: "),
				InputHelper.lerTexto("Informe o logradouro......: "),
				InputHelper.lerTexto("Informe o complemento.....: "),
				InputHelper.lerTexto("Informe o numero..........: "),
				InputHelper.lerTexto("Informe o bairro..........: "),
				InputHelper.lerTexto("Informe o cidade..........: "),
				InputHelper.lerTexto("Informe o estado..........: "),
				InputHelper.lerTexto("Informe o cep.............: ")
			);
			
			Cliente cliente = new Cliente(
				InputHelper.lerId("Informe o id do cliente...: "),
				InputHelper.lerTexto("Informe o nome.........: "),
				InputHelper.lerTexto("Informe o cpf..........: "),
				InputHelper.lerTexto("Informe o email........: ")
			);
			
			cliente.setEndereco(endereco);
			endereco.setCliente(cliente);

			//exportando os dados
			IClienteRepository clienteRepository = null; 

			String opcao = InputHelper.lerTexto("Informe CSV ou TXT para exportação dos dados: ");
			
			switch(opcao.toUpperCase()) {
				case "TXT":
					clienteRepository = new ClienteRepositoryTXT();
				break;
				
				case "CSV":
					clienteRepository = new ClienteRepositoryCSV();
				break;
				
				default:
					System.out.println("\nOpção inválida!");
				break;
			}
			
			clienteRepository.exportarDados(cliente);
			System.out.println("\nARQUIVO GRAVADO COM SUCESSO!");
			
			
		} catch (Exception e) {
			System.out.println("\nOcorreu um Erro: " + e.getMessage());
		}
		
	}
	
}
