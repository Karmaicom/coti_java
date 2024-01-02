package principal;

import entities.Produto;
import interfaces.IProdutoRepository;
import repositories.ProdutoRepository;

public class Program {

	public static void main(String[] args) {

		IProdutoRepository repository = new ProdutoRepository();

		try {
			Produto produto1 = new Produto(1, "Notebook Dell", 5500.00, 5);		
			repository.exportarDados(produto1);
			
			Produto produto2 = new Produto(1, "Play Station 5", 4200.00, 2);		
			repository.exportarDados(produto2);
			
			System.out.println("\nARQUIVO GRAVADO COM SUCESSO\n");
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		

	}

}
