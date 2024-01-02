package interfaces;

import entities.Produto;

public interface IProdutoRepository {

	public abstract void exportarDados(Produto produto) throws Exception;
	
}
