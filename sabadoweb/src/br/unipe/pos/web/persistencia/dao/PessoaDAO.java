package br.unipe.pos.web.persistencia.dao;

import java.sql.*;
import java.util.List;

import br.unipe.pos.web.persistencia.JDBCUtil;
import br.unipe.pos.web.persistencia.entidade.Pessoa;

public class PessoaDAO {
	
	
	private String SQL_INSERT = 			
			"INSERT INTO tbpessoa (nome, cpf, datanascimento, cep, logradouro, bairro, telefone) VALUES (?, ?, ?, ?, ?, ?, ?)";         
	

	/**
	 * Metodo que realiza a inclusao da pessoa no banco.
	 * @param pessoa Objeto do tipo Pessoa.
	 * @return <True> se a operação for realizada, <False> 
	 * caso contrario.
	 * @throws SQLException 
	 */
	public boolean incluir(Pessoa pessoa) {
		
		Connection conexao =  JDBCUtil.obterConexao();
		PreparedStatement pstm;
	
		try {
			
			pstm = conexao.prepareStatement(SQL_INSERT);
			pstm.setString(1, pessoa.getNome());
			pstm.setString(2, pessoa.getCpf());
			pstm.setString(3, pessoa.getDataNascimento());
			pstm.setString(4, pessoa.getCep());
			pstm.setString(5, pessoa.getLogradouro());
			pstm.setString(6, pessoa.getBairro());
			pstm.setString(7, pessoa.getTelefone());
			
			pstm.execute(); 
			
			pstm.close();
			conexao.close();
			
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		

	}
	
	
	public List<Pessoa> listar(){
		
		return null;
	}
	
	

	
	
	
	
}
