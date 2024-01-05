package principal;

import entities.Produto;
import helpers.InputHelper;
import interfaces.IProdutoRepository;
import repositories.ProdutoRepository;

public class Program {

	public static void main(String[] args) {
		
		try {
			
			Produto produto = new Produto();
			
			produto.setNome(InputHelper.lerTexto("Informe o nome do produto: "));
			produto.setPreco(InputHelper.lerNumeroDecimal("Informe o preço do produto: "));
			produto.setQuantidade(InputHelper.lerNumeroInteiro("Informe a quantidade do produto: "));
			
			IProdutoRepository produtoRepository = new ProdutoRepository();
			produtoRepository.inserir(produto);
			
			System.out.println("\nProduto Cadastrado com Sucesso!");
			
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}
	
}
