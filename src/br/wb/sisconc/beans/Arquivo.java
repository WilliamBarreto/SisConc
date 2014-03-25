package br.wb.sisconc.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ARQUIVOS")
public class Arquivo {
	
	private Integer codigo;
	private String nome;
	private String url;
	private TipoArquivo tipoArquivo;
	private Prova prova;
	
	@Id
	@GeneratedValue
	@Column(name="COD_ARQUIVO")
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	@Column(name="NOM_ARQUIVO")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column(name="URL_ARQUIVO")
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@ManyToOne
	@JoinColumn(name="COD_TIPO")
	public TipoArquivo getTipoArquivo() {
		return tipoArquivo;
	}
	public void setTipoArquivo(TipoArquivo tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cod_prova") 
	public Prova getProva() {
		return prova;
	}
	public void setProva(Prova prova) {
		this.prova = prova;
	}

	
	
}
