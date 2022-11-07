package entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.jpa.enums.TipoPessoaEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_PROPRIETARIO")
public class Proprietario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PROPRIETARIO")
	private long id;
	
	@Column(name = "TX_NOME")
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TP_PROPRIETARIO")
	private TipoPessoaEnum tipo;
	
	@Column(name = "TX_DOCUMENTO")
	private String documento;
	
	@Column(name = "ID_TELEFONE")
	private Telefone telefone;
	
	
}
