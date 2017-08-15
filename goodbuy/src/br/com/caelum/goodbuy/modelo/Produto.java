package br.com.caelum.goodbuy.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/* Esta anotação indica que esta classe virará uma tabela no banco de dados
 * e cada uma de suas instancias será uma linha da tabela.
 * Todas estas anotações da classe estão presentes na JPA */
@Entity
public class Produto {

	// @Id indica que o atributo abaixo será uma chave primaria na tabela 'Produto'
	// @GeneratedValue indica que este atributo terá a constraint 'auto_increment'
	@Id @GeneratedValue
	private Long id;
	
	private String nome;
	
	private String descricao;
	
	private Double preco;

	public String getNome() {
		return this.nome;
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
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}	
}
