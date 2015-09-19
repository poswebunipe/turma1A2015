package br.unipe.pos.web.apresentacao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unipe.pos.web.negocio.PessoaService;
import br.unipe.pos.web.persistencia.entidade.Pessoa;

/**
 * Servlet implementation class PessoaServlet
 */
@WebServlet("/pessoa.do")
public class PessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PessoaService pessoaService = new PessoaService();
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PessoaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Pessoa pessoa = new Pessoa();
		
		int codigoPessoa;	
		String tipoOperacao = request.getParameter("form_operacao");
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String dataNascimento = request.getParameter("dataNascimento");
		String cep = request.getParameter("cep");
		String logradouro = request.getParameter("logradouro");
		String bairro = request.getParameter("bairro");
		String telefone = request.getParameter("telefone");
		
		pessoa.setNome(nome);
		pessoa.setBairro(bairro);
		pessoa.setCep(cep);
		pessoa.setCpf(cpf);
		pessoa.setDataNascimento(dataNascimento);
		pessoa.setTelefone(telefone);
		pessoa.setLogradouro(logradouro);
		
		if(tipoOperacao.equalsIgnoreCase("incluir")){
			pessoaService.incluir(pessoa);
		}
		
		if(tipoOperacao.equalsIgnoreCase("alterar")){
		//	pessoaService.alterar(pessoa);
		}
		
		if(tipoOperacao.equalsIgnoreCase("excluir")){
		//	spessoaService.excluir(pessoa);
		}
		
		
		
	}

	

	public PessoaService getPessoaService() {
		return pessoaService;
	}

	public void setPessoaService(PessoaService pessoaService) {
		this.pessoaService = pessoaService;
	}

}
