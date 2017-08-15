package br.com.caelum.goodbuy.testes;

import br.com.caelum.dao.ProdutoDao;
import br.com.caelum.goodbuy.modelo.Produto;

public class AdicaoDeProduto {

	public static void main(String[] args) {
		
		// CRIAÇÃO DO PRODUTO
		Produto produto = criaProduto();		
		
		// INSERÇÃO DO PRODUTO NO BANCO DE DADOS
		new ProdutoDao().salva(produto);
	}

	public static Produto criaProduto() {
		Produto produto = new Produto();
		produto.setNome("Teclado");
		produto.setDescricao("Teclado ABNT2");
		produto.setPreco(20.49);
		return produto;
	}
}
