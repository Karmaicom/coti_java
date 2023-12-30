package entities;

import enums.TipoContratacao;

public class Funcionario extends Pessoa {

	private String cpf;
	private String matricula;
	private TipoContratacao tipoContratacao;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public TipoContratacao getTipoContratacao() {
		return tipoContratacao;
	}

	public void setTipoContratacao(TipoContratacao tipoContratacao) {
		this.tipoContratacao = tipoContratacao;
	}

}
