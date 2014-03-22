package br.wb.sisconc.control;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.wb.sisconc.beans.Orgao;
import br.wb.sisconc.dao.OrgaoDAO;

@ManagedBean(name="orgaoMB")
@ApplicationScoped
public class OrgaoMB implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Orgao orgao;
	private OrgaoDAO orgaoDao;
	private List<Orgao> orgaos;

	
	public OrgaoMB(){
		orgao = new Orgao();
		orgaoDao = new OrgaoDAO();
		orgaos = new OrgaoDAO().findAll(Orgao.class);
	}
	
	public OrgaoDAO getOrgaoDao() {
		return orgaoDao;
	}

	public void setOrgaoDao(OrgaoDAO orgaoDao) {
		this.orgaoDao = orgaoDao;
	}

	public List<Orgao> getOrgaos() {
		return orgaos;
	}

	public void setOrgaos(List<Orgao> orgaos) {
		this.orgaos = orgaos;
	}
	
	public Orgao getOrgao() {
		return orgao;
	}

	public void setOrgao(Orgao orgao) {
		this.orgao = orgao;
	}
	
	public String salvar(){
		orgaoDao.saveOrUpdate(orgao);
		orgao = new Orgao();
		orgaos = orgaoDao.findAll(Orgao.class);
		return "listaOrgao";		
	}
	
	public String atualizar(){
		//orgao = (Orgao) orgaoDao.buscarPorId(Orgao.class, 1);
		return cadastrar();
	}
	
	public String cadastrar(){
		return "cadastraOrgao";
	}
}
