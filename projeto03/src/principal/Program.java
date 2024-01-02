package principal;

import entities.Empresa;
import helpers.InputHelper;
import repositories.EmpresaRepository;

public class Program {

	public static void main(String[] args) {
		
		
		try {
			System.out.println("\n *** ENTRE COM OS DADOS DA EMPRESA ***\n");
			
			Empresa empresa = new Empresa(
				InputHelper.lerId("Informe o Id: "),
				InputHelper.lerTexto("Informe o nome fantasia: "),
				InputHelper.lerTexto("Informe a razão social: "),
				InputHelper.lerTexto("Informe o cnpj: ")
	        );
			
			System.out.println("\n\nDADOS DA EMPRESA\n");
			System.out.println("Id......................: " + empresa.getIdEmpresa());
			System.out.println("Nome Fantasia...........: " + empresa.getNomeFantasia());
			System.out.println("Razão Social............: " + empresa.getRazaoSocial());
			System.out.println("Cnpj....................: " + empresa.getCnpj());
			
			EmpresaRepository empresaRepository = new EmpresaRepository();
			empresaRepository.exportarDados(empresa);
			
			System.out.println("\nARQUIVO GERADO COM SUCESSO!");
			
		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
		
	}
	
}
