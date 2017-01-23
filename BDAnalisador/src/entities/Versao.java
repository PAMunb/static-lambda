package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Versao implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVersao;
	private Projeto projeto;
	private String numVersao;
	
	public Integer getId() {
		return idVersao;
	}
	public void setId(Integer id) {
		this.idVersao = id;
	}
	public Projeto getProjeto() {
		return projeto;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	public String getNumVersao() {
		return numVersao;
	}
	public void setNumVersao(String numVersao) {
		this.numVersao = numVersao;
	}
}