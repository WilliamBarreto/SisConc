package br.wb.sisconc.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PROVAS")
public class Prova {
	
	private Integer codigo;
	private Orgao orgao;
	private Banca banca;
	private String ano;
	private String cargo;
	private List<Arquivo> arquivos;
	
//	public Prova(){
//		this.banca = new Banca();
//		this.orgao = new Orgao();
//	}
//	
	@Id
	@GeneratedValue
	@Column(name="COD_PROVA")
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	@ManyToOne
	@JoinColumn(name="COD_ORGAO")
	public Orgao getOrgao() {
		return orgao;
	}
	public void setOrgao(Orgao orgao) {
		this.orgao = orgao;
	}
	
	@ManyToOne
	@JoinColumn(name="COD_BANCA")
	public Banca getBanca() {
		return banca;
	}
	public void setBanca(Banca banca) {
		this.banca = banca;
	}
	
	@Column(name="ANO_PROVA")
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	@Column(name="CARGO_PROVA")
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@OneToMany(mappedBy = "prova")
	public List<Arquivo> getArquivos() {
		return arquivos;
	}
	public void setArquivos(List<Arquivo> arquivos) {
		this.arquivos = arquivos;
	}
	
	
}
