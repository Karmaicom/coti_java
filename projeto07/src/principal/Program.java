package principal;

import java.util.ArrayList;
import java.util.List;

import entities.Empresa;
import entities.Funcionario;
import helpers.InputHelper;

public class Program {

	public static void main(String[] args) {
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		Integer quantidade = InputHelper.lerNumeroInteiro("Informa a quantidade de funcionarios: ");
		
		for (int i=1; i<=quantidade; i++) {
			Funcionario funcionario = new Funcionario(
					InputHelper.lerNumeroInteiro("Informe o id do funcionario: "), 
					InputHelper.lerTexto("Informe o nome do funcionario: "),
					InputHelper.lerTexto("Informe o cpf do funcionario: "),
					InputHelper.lerTexto("Informe a matricula do funcionario: ")			
			);	
			System.out.println("\n");
			
			funcionarios.add(funcionario);
		}
		
		System.out.println("");
		
		Empresa empresa = new Empresa(
				InputHelper.lerNumeroInteiro("Informe o id da empresa: "), 
				InputHelper.lerTexto("Informe o nome fantasia da empresa: "),
				InputHelper.lerTexto("Informe a razao social da empresa: "),
				InputHelper.lerTexto("Informe o cnpj da empresa: "),
				funcionarios
		);
		
		System.out.println("\nDados da empresa: ");
		System.out.println("Id da empresa....................: " + empresa.getIdEmpresa());
		System.out.println("Nome fantasia da empresa.........: " + empresa.getNomeFantasia());
		System.out.println("Razão social da empresa..........: " + empresa.getRazaoSocial());
		System.out.println("Cnpj da empresa..................: " + empresa.getCnpj());
	
		System.out.println("\n Funcionários: ");
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println("\tId do funcionario....................: " + funcionario.getIdFuncionario());
			System.out.println("\tNome do funcionario....................: " + funcionario.getNome());
			System.out.println("\tCpf do funcionario....................: " + funcionario.getCpf());
			System.out.println("\tMatricula do funcionario....................: " + funcionario.getMatricula());
			System.out.println();
		}

	}
	
}
