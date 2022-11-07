package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.jpa.enums.StatusAgenteEnum;
import br.com.etechoracio.jpa.enums.TipoAgenteEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="TBL_AGENTE_AUTUADOR")
@Entity
public class AgenteAtuador {
	@Id
	@Column(name="ID_AGENTE_AUTUADOR")
	private int id;
	
	@Column(name="TX_NOME")
	private String nome;
	
	@Column(name="TX_FONE")
	private String telefone;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TP_AGENTE")
	private TipoAgenteEnum tipo;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="ST_AGENTE")
	private StatusAgenteEnum status;
}
