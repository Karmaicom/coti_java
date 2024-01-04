package interfaces;

import entities.Cliente;

public interface IClienteRepository {

	public abstract void exportarDados(Cliente cliente) throws Exception;

}
