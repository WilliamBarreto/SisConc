package br.wb.sisconc.control;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.wb.sisconc.beans.Arquivo;
import br.wb.sisconc.beans.Banca;
import br.wb.sisconc.beans.Orgao;
import br.wb.sisconc.beans.Prova;
import br.wb.sisconc.dao.BancaDAO;
import br.wb.sisconc.dao.OrgaoDAO;
import br.wb.sisconc.dao.ProvaDAO;

@ManagedBean(name="provaMB")
@ApplicationScoped
public class ProvaMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Prova prova;
	private List<Prova> provas;
	private ProvaDAO provaDao;
	
	private List<Orgao> orgaos;
	private List<Banca> bancas;
	private Arquivo arquivo;
	
	public ProvaMB(){
		prova = new Prova();
		provaDao = new ProvaDAO();
		orgaos = new OrgaoDAO().findAll(Orgao.class);
		bancas = new BancaDAO().findAll(Banca.class);
	}
	
	
	public String cadastrar(){
		orgaos = new OrgaoDAO().findAll(Orgao.class);
		bancas = new BancaDAO().findAll(Banca.class);		
		return "cadastraProva?faces-redirect=true";
	}
	
	public String salvar(){
		provaDao.saveOrUpdate(prova);
		prova = new Prova();
		provas = provaDao.findAll(Prova.class);
		return "listaProva";
	}

	
	public List<Orgao> getOrgaos() {
		return orgaos;
	}

	public void setOrgaos(List<Orgao> orgaos) {
		this.orgaos = orgaos;
	}

	public List<Banca> getBancas() {
		return bancas;
	}

	public void setBancas(List<Banca> bancas) {
		this.bancas = bancas;
	}

	public Prova getProva() {
		return prova;
	}
	public void setProva(Prova prova) {
		this.prova = prova;
	}
	public List<Prova> getProvas() {
		return provas;
	}
	public void setProvas(List<Prova> provas) {
		this.provas = provas;
	}
	public ProvaDAO getProvaDao() {
		return provaDao;
	}
	public void setProvaDao(ProvaDAO provaDao) {
		this.provaDao = provaDao;
	}


	public Arquivo getArquivo() {
		return arquivo;
	}


	public void setArquivo(Arquivo arquivo) {
		this.arquivo = arquivo;
	}
	
}
