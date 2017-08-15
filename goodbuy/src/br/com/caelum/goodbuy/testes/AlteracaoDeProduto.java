package br.com.caelum.goodbuy.testes;

import br.com.caelum.dao.ProdutoDao;

public class AlteracaoDeProduto {

	public static void main(String[] args) {		
		new ProdutoDao().alterar(1L);
	}
}
