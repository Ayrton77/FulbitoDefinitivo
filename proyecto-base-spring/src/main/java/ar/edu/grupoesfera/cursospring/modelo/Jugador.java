package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Jugador {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Idjugador;
	
	@Column
	private String nombreJugador;
	
	@Column
	private Integer goles=0;
	
	@Column
	private Integer tarjetasAmarrillas=0;
	
	@Column
	private Integer tarjetasRojas=0;
	
	@Column
	private Boolean estaHabilitado=true;
	
	
	//bdd--
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="idEquipo")
		private Equipo equipo;
		
		//bdd--torneo
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="idTorneo")
		private Torneo torneoJugador;
	
	//-const
	public Jugador() {

		
	}


	
	
	//gt

	
	public Long getIdjugador() {
		return Idjugador;
	}



	public Equipo getEquipo() {
		return equipo;
	}




	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}




	public void setIdjugador(Long idjugador) {
		Idjugador = idjugador;
	}



	public String getNombreJugador() {
		return nombreJugador;
	}



	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}




	public Integer getGoles() {
		return goles;
	}




	public void setGoles(Integer goles) {
		this.goles = goles;
	}




	public Integer getTarjetasAmarrillas() {
		return tarjetasAmarrillas;
	}




	public void setTarjetasAmarrillas(Integer tarjetasAmarrillas) {
		this.tarjetasAmarrillas = tarjetasAmarrillas;
	}




	public Integer getTarjetasRojas() {
		return tarjetasRojas;
	}




	public void setTarjetasRojas(Integer tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}




	public Boolean getEstaHabilitado() {
		return estaHabilitado;
	}




	public void setEstaHabilitado(Boolean estaHabilitado) {
		this.estaHabilitado = estaHabilitado;
	}




	public Torneo getTorneoJugador() {
		return torneoJugador;
	}




	public void setTorneoJugador(Torneo torneoJugador) {
		this.torneoJugador = torneoJugador;
	}
	
	
	
	
}
