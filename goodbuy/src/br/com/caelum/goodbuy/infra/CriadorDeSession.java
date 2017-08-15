package br.com.caelum.goodbuy.infra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CriadorDeSession {

	public static Session getSession() {
		// Objeto responsavel pela configuração do Hibernate
		Configuration configuration = new Configuration();
		// Lendo o 'hibernate.cfg.xml' onde estão as configurações para o banco de dados especifico
		configuration.configure();
		
		// Retorna uma SessionFactory baseado nas configurações do XML lido
		SessionFactory factory = configuration.buildSessionFactory();
		
		// Abre a conexão com o banco de dados
		Session session = factory.openSession();
		return session;
	}

}
