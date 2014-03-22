package br.wb.sisconc.control;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.wb.sisconc.beans.Banca;
import br.wb.sisconc.dao.BancaDAO;

@ManagedBean(name="bancaMB")
@ApplicationScoped
public class BancaMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Banca banca;
	private List<Banca> bancas;
	private BancaDAO bancaDao;
	

	public BancaMB(){
		banca = new Banca();
		bancaDao = new BancaDAO();
		bancas = bancaDao.findAll(Banca.class);
	}
	
	public String cadastrar(){
		return "cadastraBanca";
	}
	
	public String salvar(){
		bancaDao.saveOrUpdate(banca);
		banca = new Banca();
		bancas = bancaDao.findAll(Banca.class);	
		return "listaBanca";
	}
	
	public String atualizar(){
		return "cadastraBanca";
	}
	
		
	public Banca getBanca() {
		return banca;
	}
	public void setBanca(Banca banca) {
		this.banca = banca;
	}
	public List<Banca> getBancas() {
		return bancas;
	}
	public void setBancas(List<Banca> bancas) {
		this.bancas = bancas;
	}
	public BancaDAO getBancaDao() {
		return bancaDao;
	}
	public void setBancaDao(BancaDAO bancaDao) {
		this.bancaDao = bancaDao;
	}
	
	
	
	
	
	
	
}
