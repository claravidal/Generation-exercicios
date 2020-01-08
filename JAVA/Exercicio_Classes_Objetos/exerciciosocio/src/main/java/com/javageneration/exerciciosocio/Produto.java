package com.javageneration.exerciciosocio;

public class Produto {
	private int codigo;
	private String nome;
	private String descricao;
	private float precoCompra;
	private float precoVenda;
	private int qtdeestoque;
	private boolean ativo;
	private String dataCadastro;

	public Produto(int codigo, String nome, String descricao, float precoCompra, float precoVenda, int qtdeestoque,
			boolean ativo, String dataCadastro) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.qtdeestoque = qtdeestoque;
		this.ativo = ativo;
		this.dataCadastro = dataCadastro;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(float precoCompra) {
		this.precoCompra = precoCompra;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getQtdeestoque() {
		return qtdeestoque;
	}

	public void setQtdeestoque(int qtdeestoque) {
		this.qtdeestoque = qtdeestoque;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	static void inserir() {
		System.out.println(" Insira aqui sua informação: ");
	}

	static void alterar() {
		System.out.println(" Alterea aqui sua informação: ");

	}

	static void excluir() {
		System.out.println(" Exclua aqui sua informação: ");
	}

	static void pesquisar() {
		System.out.println(" Pesquise aqui sua informação: ");
	}
}