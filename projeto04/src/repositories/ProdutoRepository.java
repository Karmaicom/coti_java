package repositories;

import java.io.FileWriter;
import java.io.PrintWriter;

import entities.Produto;
import interfaces.IProdutoRepository;

public class ProdutoRepository implements IProdutoRepository {

	@Override
	public void exportarDados(Produto produto) throws Exception {
		
		PrintWriter print = new PrintWriter(new FileWriter("c:\\temp\\coti\\produto.txt", true));
		
		print.println("Id........................: " + produto.getIdProduto());
		print.println("Nome......................: " + produto.getNome());
		print.println("Preço.....................: " + produto.getPreco());
		print.println("Quantidade................: " + produto.getQuantidade());
		print.println("-----------------------------------------------------------------");
		
		print.flush();
		print.close();
	}

}
