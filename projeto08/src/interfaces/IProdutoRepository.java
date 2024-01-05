package interfaces;

import java.util.List;

import entities.Produto;

public interface IProdutoRepository {

	public abstract void inserir(Produto produto) throws Exception;
	
	public abstract void alterar(Produto produto) throws Exception;
	
	public abstract void excluir(Produto produto) throws Exception;
	
	public List<Produto> consultar() throws Exception;
	
}
