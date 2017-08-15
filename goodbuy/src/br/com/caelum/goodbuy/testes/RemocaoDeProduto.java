package br.com.caelum.goodbuy.testes;

import br.com.caelum.dao.ProdutoDao;

public class RemocaoDeProduto {

	public static void main(String[] args) {
		new ProdutoDao().remove(3L);
	}
}