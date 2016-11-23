package ar.edu.grupoesfera.cursospring.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Fecha {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFecha;
	
	//bddConTorneo
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idTorneo")
	private Torneo torneoFecha;
	
	//bddConLlaves
	@Column
	@OneToMany (mappedBy="fecha", cascade=CascadeType.ALL)
    private List <Llave> listaDeLlaves = new ArrayList <> ();
	
	
	
	//constructor
	public Fecha()
	{
		
	}
	//geters and set

	public Long getIdFecha() {
		return idFecha;
	}

	public void setIdFecha(Long idFecha) {
		this.idFecha = idFecha;
	}

	public Torneo getTorneoFecha() {
		return torneoFecha;
	}

	public void setTorneoFecha(Torneo torneoFecha) {
		this.torneoFecha = torneoFecha;
	}

	public List<Llave> getListaDeLlaves() {
		return listaDeLlaves;
	}

	public void setListaDeLlaves(List<Llave> listaDeLlaves) {
		this.listaDeLlaves = listaDeLlaves;
	}

	
	
	
	
	
	
}
