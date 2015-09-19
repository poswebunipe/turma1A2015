package br.unipe.pos.web.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	
	//classe que tem referência para conexão com o banco de dados.
	private static Connection conexao;
	
	private static String HOST = "jdbc:mysql://localhost:3306/sabadopos";
	private static String USUARIO = "root";
	private static String SENHA = "";
	
	
	public static Connection obterConexao(){			

		try {
			
			//Verifica se o driver JDBC esta no path do projeto
			Class.forName("com.mysql.jdbc.Driver");
			//Obtém a conexão com o banco de dados.
			conexao = DriverManager.getConnection(HOST,USUARIO,SENHA);
			System.out.println("Iniciou Conexao");
			
		} catch (SQLException e) {
			System.out.println("Conexão Falhou");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return conexao;
		
	}
	
	

}





