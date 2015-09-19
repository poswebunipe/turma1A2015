package br.unipe.pos.servlet;

import br.unipe.pos.web.negocio.PessoaService;
import br.unipe.pos.web.persistencia.entidade.Pessoa;

public class Teste {
	
	public static void main(String[] args) {
		
		PessoaService pessoaService = new PessoaService();
		Pessoa pessoa = new Pessoa();
		
		pessoa.setBairro("Cristo");
		pessoa.setCep("58031010");
		pessoa.setCpf("1023123123");
		pessoa.setDataNascimento("17/12/1982");
		pessoa.setTelefone("30213052");
		pessoa.setLogradouro("Rua do café");
		pessoa.setNome("Rodrigo Fujioka");
		
		boolean sucesso = pessoaService.incluir(pessoa);
		
		if(sucesso){
			System.out.println("Inclusão realizada");
		}else{
			System.out.println("Falha na inclusão");
		}
		
	}

}
