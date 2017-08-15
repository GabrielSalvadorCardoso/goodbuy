package br.com.caelum.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.goodbuy.infra.CriadorDeSession;
import br.com.caelum.goodbuy.modelo.Produto;

public class ProdutoDao {
	
	// ProdutoDao tambem deve criar a Session pois ele deve encapsular todo o procedimento de acesso aos dados
	private final Session session;

	public ProdutoDao() {
		// Operação semelhante a usada sem framework apenas com ConnectionFactory
		this.session = CriadorDeSession.getSession();
	}
	
	public void salva(Produto produto) {		
		// Após abrir a conexão começamos uma transação
		Transaction tx = this.session.beginTransaction();
		// Realiza o insert no banco de dados
		this.session.save(produto);
		// Efeiva a operação
		tx.commit();
	}

	public void alterar(Serializable id) {
		Produto produto = this.pega(id);
		
		// Só precisamos iniciar uma transação quando vamos alterar o banco de dados
		Transaction tx = this.session.beginTransaction();
		produto.setPreco(50.50);
		this.session.update(produto);
		tx.commit();
	}

	public Produto pega(Serializable id) {
		// Retorna um produto do banco de dados cujo identificador seja 1
		Produto produto = (Produto) this.session.load(Produto.class, id);
		return produto;
	}
	
	public void remove(Serializable id) {
		Produto produto = this.pega(id);
		
		Transaction tx = this.session.beginTransaction();
		this.session.delete(produto);
		tx.commit();
	}
}
