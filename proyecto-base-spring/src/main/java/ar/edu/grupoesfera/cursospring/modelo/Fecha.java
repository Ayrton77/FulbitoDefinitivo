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
	
	//bdd oc partido
	@Column
	@OneToMany (mappedBy="fecha", cascade=CascadeType.ALL)
    private List <Partido> listaDePartidos = new ArrayList <> ();
	//bdd con torneo
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idTorneo")
	private Torneo torneoFecha;
	
	//C
	public Fecha()
	{
		
	}
		//GT
	public Long getIdFecha() {
		return idFecha;
	}

	public void setIdFecha(Long idFecha) {
		this.idFecha = idFecha;
	}
	public List<Partido> getListaDePartidos() {
		return listaDePartidos;
	}
	public void setListaDePartidos(List<Partido> listaDePartidos) {
		this.listaDePartidos = listaDePartidos;
	}
	public Torneo getTorneoFecha() {
		return torneoFecha;
	}
	public void setTorneoFecha(Torneo torneoFecha) {
		this.torneoFecha = torneoFecha;
	}



	
	
}
