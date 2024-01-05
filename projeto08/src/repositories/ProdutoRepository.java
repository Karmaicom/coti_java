package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import entities.Produto;
import interfaces.IProdutoRepository;

public class ProdutoRepository implements IProdutoRepository {

	public Connection conectarMySQL() throws Exception {
		String url = "jdbc:mysql://localhost:3306/bd_produtos?useTimezone=true&serverTimeZone=UTC&useSSL=false";
		String user = "root";
		String password = "q1w2e3r4";
		
		return DriverManager.getConnection(url, user, password);
	}
	
	public void fecharConexaoMySQL(PreparedStatement stmt, Connection conn) throws Exception {
		stmt.close();
		conn.close();
	}

	@Override
	public void inserir(Produto produto) throws Exception {
		Connection conn = this.conectarMySQL();
		
		PreparedStatement stmt = conn.prepareStatement("insert into produto(nome, preco, quantidade) values (?,?,?)");
		stmt.setString(1, produto.getNome());
		stmt.setDouble(2, produto.getPreco());
		stmt.setInt(3, produto.getQuantidade());
		
		stmt.execute();
		
		fecharConexaoMySQL(stmt, conn);
	}

	@Override
	public void alterar(Produto produto) throws Exception {
		
	}

	@Override
	public void excluir(Produto produto) throws Exception {
		
	}

	@Override
	public List<Produto> consultar() throws Exception {
		return null;
	}

}
