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
public class Llave {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idLlave;
	
	//bdd con fecha
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idFecha")
	private Fecha fecha;
	
	//bdd con equipo
	@Column
	@OneToMany (mappedBy="llave", cascade=CascadeType.ALL)
    private List <Equipo> listaDeEquiposLlave = new ArrayList <> ();
	//cont
	public Llave()
	{
		
	}
	//-gt
	public Long getIdLlave() {
		return idLlave;
	}

	public void setIdLlave(Long idLlave) {
		this.idLlave = idLlave;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	public List<Equipo> getListaDeEquiposLlave() {
		return listaDeEquiposLlave;
	}
	public void setListaDeEquiposLlave(List<Equipo> listaDeEquiposLlave) {
		this.listaDeEquiposLlave = listaDeEquiposLlave;
	}
	

	
	
}
