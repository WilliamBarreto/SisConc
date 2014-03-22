package br.wb.sisconc.control;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.wb.sisconc.beans.TipoArquivo;
import br.wb.sisconc.dao.TipoArquivoDAO;

@ManagedBean(name="tipoArquivoMB")
@ApplicationScoped
public class TipoArquivoMB {
	
	private TipoArquivo tipoArquivo;
	private List<TipoArquivo> tipoArquivos;
	private TipoArquivoDAO tipoArquivoDao;
	
	public TipoArquivoMB(){
		tipoArquivo = new TipoArquivo();
		tipoArquivoDao = new TipoArquivoDAO();
		tipoArquivos = tipoArquivoDao.findAll(TipoArquivo.class);
	}
	
	public String atualizar(){
		return cadastrar();
	}
	
	public String cadastrar(){
		return "cadastraTipoArquivo";
	}
	public String salvar(){
		tipoArquivoDao.saveOrUpdate(tipoArquivo);
		tipoArquivo = new TipoArquivo();
		tipoArquivos = tipoArquivoDao.findAll(TipoArquivo.class);
		return "listaTipoArquivo";
	}
	
	public TipoArquivo getTipoArquivo() {
		return tipoArquivo;
	}
	public void setTipoArquivo(TipoArquivo tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}
	public List<TipoArquivo> getTipoArquivos() {
		return tipoArquivos;
	}
	public void setTipoArquivos(List<TipoArquivo> tipoArquivos) {
		this.tipoArquivos = tipoArquivos;
	}
	public TipoArquivoDAO getTipoArquivoDao() {
		return tipoArquivoDao;
	}
	public void setTipoArquivoDao(TipoArquivoDAO tipoArquivoDao) {
		this.tipoArquivoDao = tipoArquivoDao;
	}
	
	
	

}
