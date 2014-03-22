package br.wb.sisconc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TIPOS_ARQUIVO")
public class TipoArquivo {

	private Integer codigo;
	private String nome;
	
	@Id
	@GeneratedValue
	@Column(name="COD_TIPO")
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	@Column(name="NOM_TIPO")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
