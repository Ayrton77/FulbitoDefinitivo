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
public class Torneo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTorneo;
	
	private String nombreTorneo;
	
	
	//bdd con equipo
	@Column
	@OneToMany (mappedBy="torneo", cascade=CascadeType.ALL)
    private List <Equipo> listaDeEquipos = new ArrayList <> ();
	
	//bdd con usuario loguiado
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idUsuarioLoguiado")
	private UsuarioLoguiado usuarioLoguiado;
	
	//bdd con fecha
	
	@Column
	@OneToMany (mappedBy="torneoFecha", cascade=CascadeType.ALL)
    private List <Fecha> listaDeFechas = new ArrayList <> ();
	//bdd con equipo
		
	//contructor 
	public Torneo()
	{
		
	}
	
	//geters and setters

	public Long getIdTorneo() {
		return idTorneo;
	}

	public void setIdTorneo(Long idTorneo) {
		this.idTorneo = idTorneo;
	}

	public String getNombreTorneo() {
		return nombreTorneo;
	}

	public void setNombreTorneo(String nombreTorneo) {
		this.nombreTorneo = nombreTorneo;
	}

	public List<Equipo> getListaDeEquipos() {
		return listaDeEquipos;
	}

	public void setListaDeEquipos(List<Equipo> listaDeEquipos) {
		this.listaDeEquipos = listaDeEquipos;
	}

	public UsuarioLoguiado getUsuarioLoguiado() {
		return usuarioLoguiado;
	}

	public void setUsuarioLoguiado(UsuarioLoguiado usuarioLoguiado) {
		this.usuarioLoguiado = usuarioLoguiado;
	}

	public List<Fecha> getListaDeFechas() {
		return listaDeFechas;
	}

	public void setListaDeFechas(List<Fecha> listaDeFechas) {
		this.listaDeFechas = listaDeFechas;
	}


	
	
	
}
