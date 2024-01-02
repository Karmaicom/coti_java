package repositories;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Empresa;

public class EmpresaRepository {

	public void exportarDados(Empresa empresa) throws Exception {
		
		SimpleDateFormat sdfArq = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyMMddHHmmss");
		String dataHora = sdf.format(new Date());
		
		PrintWriter print = new PrintWriter(new File("c:\\temp\\coti\\empresa_"+dataHora+".txt"));
		
		print.println("Dados da Empresa:");
		print.println("Arquivo gerado em: " + sdfArq.format(new Date()));
		
		print.println("Id......................: " + empresa.getIdEmpresa());
		print.println("Nome Fantasia...........: " + empresa.getNomeFantasia());
		print.println("Razão Social............: " + empresa.getRazaoSocial());
		print.println("Cnpj....................: " + empresa.getCnpj());
		
		print.flush();
		print.close();
	}
	
}
