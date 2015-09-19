package br.unipe.pos.web.negocio;

import java.util.List;

import br.unipe.pos.web.persistencia.dao.PessoaDAO;
import br.unipe.pos.web.persistencia.entidade.Pessoa;

public class PessoaService {
	
	private PessoaDAO pessoaDAO = new PessoaDAO();
	
	
	/**
	 * Metodo que realiza a inclusao da pessoa no banco.
	 * @param pessoa Objeto do tipo Pessoa.
	 * @return <True> se a operação for realizada, <False> 
	 * caso contrario.
	 */
	public boolean incluir(Pessoa pessoa){
	
		if(pessoa==null){
			return false;
		}
		
		return pessoaDAO.incluir(pessoa);
	}
	
	
	public List<Pessoa> listar(){
		
		return pessoaDAO.listar();
	}
	
	

	

}
